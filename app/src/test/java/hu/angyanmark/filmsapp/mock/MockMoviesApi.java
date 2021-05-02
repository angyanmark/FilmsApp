package hu.angyanmark.filmsapp.mock;

import java.io.IOException;
import java.util.ArrayList;

import hu.angyanmark.filmsapp.model.MovieDetails;
import hu.angyanmark.filmsapp.model.PopularMovie;
import hu.angyanmark.filmsapp.model.PopularMoviesResponse;
import hu.angyanmark.filmsapp.network.MoviesApi;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.mockito.Mockito.mock;

public class MockMoviesApi implements MoviesApi {

    private ArrayList<PopularMovie> movies = new ArrayList<>();
    private ArrayList<MovieDetails> movieDetails = new ArrayList<>();

    private static boolean shouldFail;
    public static boolean getShouldFail() {
        return shouldFail;
    }
    public static void setShouldFail(boolean sf) {
        shouldFail = sf;
    }

    public MockMoviesApi(){
        PopularMovie movie1 = new PopularMovie();
        movie1.setId(27205);
        movie1.setTitle("Inception");
        movie1.setReleaseDate("2010-07-16");
        movies.add(movie1);

        PopularMovie movie2 = new PopularMovie();
        movie2.setId(157336);
        movie2.setTitle("Interstellar");
        movie2.setReleaseDate("2014-11-07");
        movies.add(movie2);

        MovieDetails movie3 = new MovieDetails();
        movie3.setId(27205);
        movie3.setTitle("Inception");
        movie3.setReleaseDate("2010-07-16");
        movieDetails.add(movie3);

        MovieDetails movie4 = new MovieDetails();
        movie4.setId(157336);
        movie4.setTitle("Interstellar");
        movie4.setReleaseDate("2014-11-07");
        movieDetails.add(movie4);
    }

    @Override
    public Call<PopularMoviesResponse> getMovies(String apiKey) {
        PopularMoviesResponse response = new PopularMoviesResponse();
        response.setPage(1);
        response.setResults(movies);
        response.setTotalPages(1);
        response.setTotalResults(2);

        Call<PopularMoviesResponse> call = new Call<PopularMoviesResponse>() {
            @Override
            public Response<PopularMoviesResponse> execute() throws IOException {
                if(!shouldFail)
                    return Response.success(response);
                else
                    return Response.error(500, mock(ResponseBody.class));
            }

            @Override
            public void enqueue(Callback<PopularMoviesResponse> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<PopularMoviesResponse> clone() {
                return this;
            }

            @Override
            public Request request() {
                return null;
            }
        };

        return call;
    }

    @Override
    public Call<MovieDetails> getMovie(Integer movieId, String apiKey) {

        MovieDetails movieToReturn = new MovieDetails();
        for(MovieDetails movie : movieDetails) {
            if(movie.getId().equals(movieId)) {
                movieToReturn = movie;
            }
        }
        MovieDetails finalMovieToReturn = movieToReturn;

        Call<MovieDetails> call = new Call<MovieDetails>() {
            @Override
            public Response<MovieDetails> execute() throws IOException {
                if(!shouldFail)
                    return Response.success(finalMovieToReturn);
                else
                    return Response.error(500, mock(ResponseBody.class));
            }

            @Override
            public void enqueue(Callback<MovieDetails> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<MovieDetails> clone() {
                return this;
            }

            @Override
            public Request request() {
                return null;
            }
        };

        return call;
    }

    @Override
    public Call<Void> deleteMovie(Integer movieId) {
        movieDetails.removeIf(movie -> movie.getId().equals(movieId));

        Call<Void> call = new Call<Void>() {
            @Override
            public Response<Void> execute() throws IOException {
                return Response.success(null);
            }

            @Override
            public void enqueue(Callback<Void> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<Void> clone() {
                return this;
            }

            @Override
            public Request request() {
                return null;
            }
        };

        return call;
    }

    @Override
    public Call<MovieDetails> postMovie(Integer movieId, MovieDetails data) {
        movieDetails.add(data);

        Call<MovieDetails> call = new Call<MovieDetails>() {
            @Override
            public Response<MovieDetails> execute() throws IOException {
                return Response.success(data);
            }

            @Override
            public void enqueue(Callback<MovieDetails> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<MovieDetails> clone() {
                return this;
            }

            @Override
            public Request request() {
                return null;
            }
        };

        return call;
    }

    @Override
    public Call<MovieDetails> putMovie(Integer movieId, MovieDetails data) {
        movieDetails.removeIf(movie -> movie.getId().equals(movieId));
        movieDetails.add(data);

        Call<MovieDetails> call = new Call<MovieDetails>() {
            @Override
            public Response<MovieDetails> execute() throws IOException {
                return Response.success(data);
            }

            @Override
            public void enqueue(Callback<MovieDetails> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<MovieDetails> clone() {
                return this;
            }

            @Override
            public Request request() {
                return null;
            }
        };

        return call;
    }
}
