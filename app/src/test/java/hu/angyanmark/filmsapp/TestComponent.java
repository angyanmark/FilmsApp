package hu.angyanmark.filmsapp;

import javax.inject.Singleton;

import dagger.Component;
import hu.angyanmark.filmsapp.mock.MockDatabaseModule;
import hu.angyanmark.filmsapp.mock.MockNetworkModule;
import hu.angyanmark.filmsapp.test.MoviesTest;
import hu.angyanmark.filmsapp.test.MovieTest;

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, MockDatabaseModule.class})
public interface TestComponent extends AppComponent {
    void inject(MoviesTest moviesTest);
    void inject(MovieTest movieTest);
}
