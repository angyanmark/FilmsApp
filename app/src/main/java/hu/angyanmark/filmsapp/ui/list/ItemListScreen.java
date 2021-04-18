package hu.angyanmark.filmsapp.ui.list;

import java.util.List;

import hu.angyanmark.filmsapp.model.Dummy;

public interface ItemListScreen {
    void showMovies(List<Dummy> movies);
    void showNetworkError(String message);
}
