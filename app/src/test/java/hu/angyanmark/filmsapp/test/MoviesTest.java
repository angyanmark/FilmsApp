package hu.angyanmark.filmsapp.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.DaggerTestComponent;
import hu.angyanmark.filmsapp.model.PopularMovie;
import hu.angyanmark.filmsapp.ui.list.ItemListPresenter;
import hu.angyanmark.filmsapp.ui.list.ItemListScreen;

import static hu.angyanmark.filmsapp.TestHelper.setTestInjector;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
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
    public void testSearch() {
        List<PopularMovie> movies = new ArrayList<PopularMovie>();
        itemListPresenter.showMovies();
        verify(itemListScreen).showMovies(movies);
    }


    @After
    public void tearDown() {
        itemListPresenter.detachScreen();
    }

}
