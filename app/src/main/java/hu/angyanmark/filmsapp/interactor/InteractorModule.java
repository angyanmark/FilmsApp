package hu.angyanmark.filmsapp.interactor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.angyanmark.filmsapp.interactor.movies.MoviesInteractor;
import hu.angyanmark.filmsapp.network.MoviesApi;

@Module
public class InteractorModule {
    @Provides
    @Singleton
    public MoviesInteractor provideMoviesInteractor(MoviesApi moviesApi) {
        return new MoviesInteractor(moviesApi);
    }
}
