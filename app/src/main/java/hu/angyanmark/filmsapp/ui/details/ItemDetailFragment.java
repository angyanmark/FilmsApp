package hu.angyanmark.filmsapp.ui.details;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;

import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.App;
import hu.angyanmark.filmsapp.data.AppDatabase;
import hu.angyanmark.filmsapp.model.MovieDetails;
import hu.angyanmark.filmsapp.R;

public class ItemDetailFragment extends Fragment implements ItemDetailScreen {

    public static final String ARG_ITEM_ID = "item_id";

    @Inject
    ItemDetailPresenter itemDetailPresenter;

    private AppDatabase database;

    private MovieDetails mMovie;
    private int movieId;

    private FirebaseAnalytics mFirebaseAnalytics;

    public ItemDetailFragment() {
        App.injector.inject(this);
    }

    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
        itemDetailPresenter.attachScreen(this);
    }

    @Override
    public void onDetach() {
        itemDetailPresenter.detachScreen();
        super.onDetach();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            movieId = Integer.parseInt(getArguments().getString(ARG_ITEM_ID));
            itemDetailPresenter.showMovie(movieId);

            mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());
            Bundle bundle = new Bundle();
            bundle.putInt(FirebaseAnalytics.Param.ITEM_ID, movieId);
            mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.VIEW_ITEM, bundle);
        }

        database = Room.databaseBuilder(
                getContext(),
                AppDatabase.class,
                "movies"
        ).build();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);
        return rootView;
    }

    @Override
    public void showMovie(MovieDetails movie) {
        mMovie = movie;
        setDetailContent(mMovie);
        saveMovieToDb(mMovie);
    }

    @Override
    public void showNetworkError(String message) {
        Toast.makeText(getContext(), "No internet connection", Toast.LENGTH_LONG).show();
        loadMovieFromDb();
    }

    private void setDetailContent(MovieDetails movie){
        Activity activity = this.getActivity();
        CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
        if (appBarLayout != null) {
            appBarLayout.setTitle(movie.getTitle());
        }

        ((TextView) getView().findViewById(R.id.release_date)).setText(movie.getReleaseDate());
        ((TextView) getView().findViewById(R.id.runtime)).setText(movie.getRuntime() + " minutes");
        ((TextView) getView().findViewById(R.id.budget)).setText("$" + movie.getBudget());
        ((TextView) getView().findViewById(R.id.details_vote_average)).setText(movie.getVoteAverage() + "/10");
        ((TextView) getView().findViewById(R.id.overview)).setText(movie.getOverview());
    }

    private void saveMovieToDb(MovieDetails movie){
        new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... voids) {
                database.movieDetailDao().insert(movie);
                return true;
            }
        }.execute();
    }

    private void loadMovieFromDb(){
        new AsyncTask<Void, Void, MovieDetails>() {
            @Override
            protected MovieDetails doInBackground(Void... voids) {
                return database.movieDetailDao().getMovie(movieId);
            }

            @Override
            protected void onPostExecute(MovieDetails movie) {
                if(movie != null){
                    mMovie = movie;
                    setDetailContent(mMovie);
                }
            }
        }.execute();
    }
}