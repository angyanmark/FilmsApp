package hu.angyanmark.filmsapp.ui.list;

import java.util.List;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.model.Dummy;
import hu.angyanmark.filmsapp.ui.Presenter;

public class ItemListPresenter extends Presenter<ItemListScreen> {

    @Inject
    public ItemListPresenter() {
    }

    @Override
    public void attachScreen(ItemListScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void showMovies(List<Dummy> movies) {
        screen.showMovies(movies);
    }
}

