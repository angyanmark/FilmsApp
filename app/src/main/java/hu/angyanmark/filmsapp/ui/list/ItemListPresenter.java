package hu.angyanmark.filmsapp.ui.list;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.di.Network;
import hu.angyanmark.filmsapp.interactor.movies.MoviesInteractor;
import hu.angyanmark.filmsapp.interactor.movies.event.GetMoviesEvent;
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
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {
        EventBus.getDefault().unregister(this);
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GetMoviesEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showNetworkError(event.getThrowable().getMessage());
            }
        } else {
            if (screen != null) {
                screen.showMovies(event.getMovies());
            }
        }
    }
}

