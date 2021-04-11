package hu.angyanmark.filmsapp.interactor.movies;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.App;
import hu.angyanmark.filmsapp.interactor.movies.event.GetMoviesEvent;
import hu.angyanmark.filmsapp.network.MoviesApi;

public class MoviesInteractor {
    MoviesApi moviesApi;

    @Inject
    public MoviesInteractor(MoviesApi moviesApi) {
        this.moviesApi = moviesApi;
        App.injector.inject(this);
    }

    public void getMovies() {
        /*GetMoviesEvent event = new GetMoviesEvent();
        try {
            Call<MoviesResult> moviesQueryCall = moviesApi.getMovies();

            Response<MoviesResult> response = moviesQueryCall.execute();
            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }
            event.setCode(response.code());
            event.setMovies(response.body().getMovies().getItems());
            EventBus.getDefault().post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            EventBus.getDefault().post(event);
        }*/
    }
}
