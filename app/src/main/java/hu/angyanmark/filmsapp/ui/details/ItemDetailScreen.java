package hu.angyanmark.filmsapp.ui.details;

import hu.angyanmark.filmsapp.model.Movie;

public interface ItemDetailScreen {
    void showMovie(Movie movie);
    void showNetworkError(String message);
}
