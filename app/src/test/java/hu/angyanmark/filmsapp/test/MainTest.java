package hu.angyanmark.filmsapp.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.model.Dummy;
import hu.angyanmark.filmsapp.ui.list.ItemListPresenter;
import hu.angyanmark.filmsapp.ui.list.ItemListScreen;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
public class MainTest {
    @Inject
    ItemListPresenter itemListPresenter;

    private ItemListScreen itemListScreen;

    @Before
    public void setup() {
        /*DaggerTestComponent injector = setTestInjector();
        injector.inject(this);*/
        itemListScreen = mock(ItemListScreen.class);
        itemListPresenter.attachScreen(itemListScreen);
    }

    @Test
    public void testSearch() {
        List<Dummy> movies = new ArrayList<Dummy>();
        itemListPresenter.showMovies(movies);
        verify(itemListScreen).showMovies(movies);
    }


    @After
    public void tearDown() {
        itemListPresenter.detachScreen();
    }

}
