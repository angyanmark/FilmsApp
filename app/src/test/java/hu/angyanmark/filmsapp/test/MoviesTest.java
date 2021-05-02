package hu.angyanmark.filmsapp.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.DaggerTestComponent;
import hu.angyanmark.filmsapp.mock.MockMoviesApi;
import hu.angyanmark.filmsapp.model.PopularMovie;
import hu.angyanmark.filmsapp.ui.list.ItemListPresenter;
import hu.angyanmark.filmsapp.ui.list.ItemListScreen;

import static hu.angyanmark.filmsapp.TestHelper.setTestInjector;
import static org.mockito.Mockito.mock;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class MoviesTest {
    @Inject
    ItemListPresenter itemListPresenter;

    private ItemListScreen itemListScreen;

    @Before
    public void setup() {
        DaggerTestComponent injector = setTestInjector();
        injector.inject(this);
        itemListScreen = mock(ItemListScreen.class);
        itemListPresenter.attachScreen(itemListScreen);
    }

    @Test
    public void testMoviesSuccess() {
        MockMoviesApi.setShouldFail(false);
        itemListPresenter.showMovies();
        ArgumentCaptor<ArrayList<PopularMovie>> list = ArgumentCaptor.forClass(ArrayList.class);
        Mockito.verify(itemListScreen).showMovies(list.capture());
        assert(list.getValue().size() > 0);
    }

    @Test
    public void testMoviesFail() {
        MockMoviesApi.setShouldFail(true);
        itemListPresenter.showMovies();
        Mockito.verify(itemListScreen).showNetworkError("Result code is not 200");
    }

    @After
    public void tearDown() {
        itemListPresenter.detachScreen();
    }
}
