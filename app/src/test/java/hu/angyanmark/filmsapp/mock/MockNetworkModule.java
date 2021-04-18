package hu.angyanmark.filmsapp.mock;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.angyanmark.filmsapp.network.MoviesApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class MockNetworkModule {

    @Provides
    @Singleton
    public Retrofit.Builder provideRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create());

    }

    @Provides
    @Singleton
    public MoviesApi provideMovieApi(Retrofit.Builder retrofitBuilder) {
        return new MockMoviesApi();
    }
}
