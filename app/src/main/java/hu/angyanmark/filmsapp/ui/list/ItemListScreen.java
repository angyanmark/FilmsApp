package hu.angyanmark.filmsapp.ui.list;

import java.util.List;

import hu.angyanmark.filmsapp.model.Movie;

public interface ItemListScreen {
    void showMovies(List<Movie> movies);
    void showNetworkError(String message);
}
