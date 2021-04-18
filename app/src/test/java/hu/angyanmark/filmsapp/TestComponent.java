package hu.angyanmark.filmsapp;

import javax.inject.Singleton;

import dagger.Component;
import hu.angyanmark.filmsapp.mock.MockNetworkModule;
import hu.angyanmark.filmsapp.test.MainTest;
import hu.angyanmark.filmsapp.test.MovieTest;

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class})
public interface TestComponent extends AppComponent {
    void inject(MainTest mainTest);

    void inject(MovieTest movieTest);
}
