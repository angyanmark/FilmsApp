package hu.angyanmark.filmsapp.mock;

import hu.angyanmark.filmsapp.model.MovieDetails;
import hu.angyanmark.filmsapp.model.PopularMoviesResponse;
import hu.angyanmark.filmsapp.network.MoviesApi;
import retrofit2.Call;

public class MockMoviesApi implements MoviesApi {

    @Override
    public Call<PopularMoviesResponse> getMovies(String apiKey) {
        return null;
    }

    @Override
    public Call<MovieDetails> getMovie(Integer movieId, String apiKey) {
        return null;
    }

    @Override
    public Call<Void> deleteMovie(Integer movieId) {
        return null;
    }

    @Override
    public Call<MovieDetails> postMovie(Integer movieId) {
        return null;
    }

    @Override
    public Call<MovieDetails> putMovie(Integer movieId, MovieDetails data) {
        return null;
    }
}
