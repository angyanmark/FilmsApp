package hu.angyanmark.filmsapp.ui.details;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.di.Network;
import hu.angyanmark.filmsapp.interactor.movies.MoviesInteractor;
import hu.angyanmark.filmsapp.interactor.movies.event.GetMovieEvent;
import hu.angyanmark.filmsapp.ui.Presenter;

public class ItemDetailPresenter extends Presenter<ItemDetailScreen> {

    Executor networkExecutor;
    MoviesInteractor moviesInteractor;

    @Inject
    public ItemDetailPresenter(@Network Executor networkExecutor, MoviesInteractor moviesInteractor) {
        this.networkExecutor = networkExecutor;
        this.moviesInteractor = moviesInteractor;
    }

    @Override
    public void attachScreen(ItemDetailScreen screen) {
        super.attachScreen(screen);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {
        EventBus.getDefault().unregister(this);
        super.detachScreen();
    }

    public void getMovie(final int id) {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                moviesInteractor.getMovie(id);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GetMovieEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showNetworkError(event.getThrowable().getMessage());
            }
        } else {
            if (screen != null) {
                screen.showMovie(event.getMovie());
            }
        }
    }
}
