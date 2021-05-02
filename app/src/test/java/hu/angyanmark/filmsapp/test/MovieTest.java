package hu.angyanmark.filmsapp.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.DaggerTestComponent;
import hu.angyanmark.filmsapp.mock.MockMoviesApi;
import hu.angyanmark.filmsapp.model.MovieDetails;
import hu.angyanmark.filmsapp.ui.details.ItemDetailPresenter;
import hu.angyanmark.filmsapp.ui.details.ItemDetailScreen;

import static hu.angyanmark.filmsapp.TestHelper.setTestInjector;
import static org.mockito.Mockito.mock;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class MovieTest {
    @Inject
    ItemDetailPresenter itemDetailPresenter;

    private ItemDetailScreen itemDetailScreen;

    @Before
    public void setup() {
        DaggerTestComponent injector = setTestInjector();
        injector.inject(this);
        itemDetailScreen = mock(ItemDetailScreen.class);
        itemDetailPresenter.attachScreen(itemDetailScreen);
    }

    @Test
    public void testMovieSuccess() {
        MockMoviesApi.setShouldFail(false);
        itemDetailPresenter.showMovie(11);
        ArgumentCaptor<MovieDetails> movie = ArgumentCaptor.forClass(MovieDetails.class);
        Mockito.verify(itemDetailScreen).showMovie(movie.capture());
    }

    @Test
    public void testMovieFail() {
        MockMoviesApi.setShouldFail(true);
        itemDetailPresenter.showMovie(11);
        Mockito.verify(itemDetailScreen).showNetworkError("Result code is not 200");
    }

    @Test
    public void testMovieNotFound() {
        MockMoviesApi.setShouldFail(true);
        itemDetailPresenter.showMovie(0);
        Mockito.verify(itemDetailScreen).showNetworkError("Result code is not 200");
    }

    @After
    public void tearDown() {
        itemDetailPresenter.detachScreen();
    }
}
