package hu.angyanmark.filmsapp.network;

import hu.angyanmark.filmsapp.model.MovieDetails;
import hu.angyanmark.filmsapp.model.PopularMoviesResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoviesApi {

    /**
     * @param apiKey
     * @return Call<PopularMoviesResponse>
     */
    @GET("movie/popular")
    Call<PopularMoviesResponse> getMovies(@Query("api_key") String apiKey);

    /**
     * @param movieId
     * @param apiKey
     * @return Call<MovieDetails>
     */
    @GET("movie/{movie_id}")
    Call<MovieDetails> getMovie(@Path("movie_id") Integer movieId, @Query("api_key") String apiKey);

    /**
     * @param movieId
     * @return Call<Void>
     */
    @DELETE("movie/{movie_id}/delete")
    Call<Void> deleteMovie(@Path("movie_id") Integer movieId);

    /**
     * @param movieId
     * @return Call<MovieDetails>
     */
    @POST("movies/{movie_id}/post")
    Call<MovieDetails> postMovie(@Path("movie_id") Integer movieId);

    /**
     * @param movieId
     * @param data
     * @return Call<MovieDetails>
     */
    @PUT("movies/{movie_id}/put")
    Call<MovieDetails> putMovie(@Path("movie_id") Integer movieId, @Body MovieDetails data);
}
