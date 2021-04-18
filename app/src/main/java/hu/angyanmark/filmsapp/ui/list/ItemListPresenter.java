package hu.angyanmark.filmsapp.ui.list;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.di.Network;
import hu.angyanmark.filmsapp.interactor.movies.MoviesInteractor;
import hu.angyanmark.filmsapp.ui.Presenter;

public class ItemListPresenter extends Presenter<ItemListScreen> {

    Executor networkExecutor;
    MoviesInteractor moviesInteractor;

    @Inject
    public ItemListPresenter(@Network Executor networkExecutor, MoviesInteractor moviesInteractor) {
        this.networkExecutor = networkExecutor;
        this.moviesInteractor = moviesInteractor;
    }

    @Override
    public void attachScreen(ItemListScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void showMovies() {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                moviesInteractor.getMovies();
            }
        });
    }
}

