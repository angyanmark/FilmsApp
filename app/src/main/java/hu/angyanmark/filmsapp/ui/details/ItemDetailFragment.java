package hu.angyanmark.filmsapp.ui.details;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.App;
import hu.angyanmark.filmsapp.model.MovieDetails;
import hu.angyanmark.filmsapp.R;

public class ItemDetailFragment extends Fragment implements ItemDetailScreen {

    public static final String ARG_ITEM_ID = "item_id";

    @Inject
    ItemDetailPresenter itemDetailPresenter;

    private MovieDetails mMovie;

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
            String id = getArguments().getString(ARG_ITEM_ID);
            itemDetailPresenter.getMovie(Integer.parseInt(id));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);
        return rootView;
    }

    @Override
    public void showMovie(MovieDetails movie) {
        mMovie = movie;

        if (mMovie != null) {
            setDetailContent(movie);
        }
    }

    @Override
    public void showNetworkError(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }

    private void setDetailContent(MovieDetails movie){
        Activity activity = this.getActivity();
        CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
        if (appBarLayout != null) {
            appBarLayout.setTitle(mMovie.getTitle());
        }

        if (mMovie != null) {
            ((TextView) getView().findViewById(R.id.overview)).setText(mMovie.getOverview());
        }
    }
}