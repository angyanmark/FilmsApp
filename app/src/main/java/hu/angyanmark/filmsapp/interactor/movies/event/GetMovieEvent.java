package hu.angyanmark.filmsapp.interactor.movies.event;

import hu.angyanmark.filmsapp.model.MovieDetails;

public class GetMovieEvent {
    private int code;
    private MovieDetails movie;
    private Throwable throwable;

    public GetMovieEvent() {
    }

    public GetMovieEvent(int code, MovieDetails movie, Throwable throwable) {
        this.code = code;
        this.movie = movie;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MovieDetails getMovie() {
        return movie;
    }

    public void setMovie(MovieDetails movie) {
        this.movie = movie;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
