package hu.angyanmark.filmsapp.interactor.movies;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.App;
import hu.angyanmark.filmsapp.interactor.movies.event.GetMovieEvent;
import hu.angyanmark.filmsapp.interactor.movies.event.GetMoviesEvent;
import hu.angyanmark.filmsapp.model.MovieDetails;
import hu.angyanmark.filmsapp.model.PopularMoviesResponse;
import hu.angyanmark.filmsapp.network.MoviesApi;
import retrofit2.Call;
import retrofit2.Response;

public class MoviesInteractor {
    MoviesApi moviesApi;

    @Inject
    public MoviesInteractor(MoviesApi moviesApi) {
        this.moviesApi = moviesApi;
        App.injector.inject(this);
    }

    public void getMovies() {
        GetMoviesEvent event = new GetMoviesEvent();
        try {
            Call<PopularMoviesResponse> moviesQueryCall = moviesApi.getMovies("API_KEY");

            Response<PopularMoviesResponse> response = moviesQueryCall.execute();
            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }
            event.setCode(response.code());
            event.setMovies(response.body().getResults());
            EventBus.getDefault().post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            EventBus.getDefault().post(event);
        }
    }

    public void getMovie(int id) {
        GetMovieEvent event = new GetMovieEvent();
        try {
            Call<MovieDetails> moviesQueryCall = moviesApi.getMovie(id, "API_KEY");

            Response<MovieDetails> response = moviesQueryCall.execute();
            if (response.code() != 200) {
                throw new Exception("Result code is not 200");
            }
            event.setCode(response.code());
            event.setMovie(response.body());
            EventBus.getDefault().post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            EventBus.getDefault().post(event);
        }
    }
}
