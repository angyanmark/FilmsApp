package hu.angyanmark.filmsapp.ui.list;

import java.util.List;

import hu.angyanmark.filmsapp.model.PopularMovie;

public interface ItemListScreen {
    void showMovies(List<PopularMovie> movies);
    void showNetworkError(String message);
}
