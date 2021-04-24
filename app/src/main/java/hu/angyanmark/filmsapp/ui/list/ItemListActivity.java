package hu.angyanmark.filmsapp.ui.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import hu.angyanmark.filmsapp.App;
import hu.angyanmark.filmsapp.R;
import hu.angyanmark.filmsapp.model.Dummy;
import hu.angyanmark.filmsapp.model.PopularMovie;
import hu.angyanmark.filmsapp.ui.about.AboutActivity;

import java.util.List;

import javax.inject.Inject;

public class ItemListActivity extends AppCompatActivity implements ItemListScreen {

    private boolean mTwoPane;

    @Inject
    ItemListPresenter itemListPresenter;

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
        recyclerView.setAdapter(new ItemListAdapter(this, Dummy.ITEMS, mTwoPane));
    }

    @Override
    public void showMovies(List<PopularMovie> movies) {
        View recyclerView = findViewById(R.id.item_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView, movies);
    }

    @Override
    public void showNetworkError(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}