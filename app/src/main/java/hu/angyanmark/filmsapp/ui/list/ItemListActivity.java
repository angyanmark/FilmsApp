package hu.angyanmark.filmsapp.ui.list;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import hu.angyanmark.filmsapp.App;
import hu.angyanmark.filmsapp.R;
import hu.angyanmark.filmsapp.data.AppDatabase;
import hu.angyanmark.filmsapp.model.PopularMovie;
import hu.angyanmark.filmsapp.ui.about.AboutActivity;

import java.util.List;

import javax.inject.Inject;

public class ItemListActivity extends AppCompatActivity implements ItemListScreen {

    private boolean mTwoPane;

    @Inject
    ItemListPresenter itemListPresenter;

    private AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        App.injector.inject(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        if (findViewById(R.id.item_detail_container) != null) {
            mTwoPane = true;
        }

        database = Room.databaseBuilder(
                getApplicationContext(),
                AppDatabase.class,
                "movies"
        ).build();
    }

    @Override
    protected void onStart(){
        super.onStart();
        itemListPresenter.attachScreen(this);
        itemListPresenter.showMovies();
    }

    @Override
    protected void onStop() {
        super.onStop();
        itemListPresenter.detachScreen();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_about) {
            Context context = getWindow().getDecorView().findViewById(android.R.id.content).getContext();
            Intent intent = new Intent(context, AboutActivity.class);
            context.startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView, List<PopularMovie> movies) {
        recyclerView.setAdapter(new ItemListAdapter(this, movies, mTwoPane));
    }

    private void openRecyclerView(List<PopularMovie> movies){
        View recyclerView = findViewById(R.id.item_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView, movies);
    }

    @Override
    public void showMovies(List<PopularMovie> movies) {
        openRecyclerView(movies);
        saveMoviesToDb(movies);
    }

    @Override
    public void showNetworkError(String message) {
        Toast.makeText(getApplicationContext(), "No internet connection", Toast.LENGTH_LONG).show();
        loadMoviesFromDb();
    }

    private void saveMoviesToDb(List<PopularMovie> movies){
        new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... voids) {
                database.movieDao().deleteAllMovies();
                for (PopularMovie movie : movies) {
                    database.movieDao().insert(movie);
                }
                return true;
            }
        }.execute();
    }

    private void loadMoviesFromDb(){
        new AsyncTask<Void, Void, List<PopularMovie>>() {
            @Override
            protected List<PopularMovie> doInBackground(Void... voids) {
                return database.movieDao().getAllMovies();
            }

            @Override
            protected void onPostExecute(List<PopularMovie> movies) {
                openRecyclerView(movies);
            }
        }.execute();
    }
}