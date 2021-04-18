package hu.angyanmark.filmsapp.ui.details;

import hu.angyanmark.filmsapp.model.MovieDetails;

public interface ItemDetailScreen {
    void showMovie(MovieDetails movie);
    void showNetworkError(String message);
}
