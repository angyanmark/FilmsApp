package hu.angyanmark.filmsapp.interactor.movies.event;

import java.util.List;

import hu.angyanmark.filmsapp.model.PopularMovie;

public class GetMoviesEvent {
    private int code;
    private List<PopularMovie> movies;
    private Throwable throwable;

    public GetMoviesEvent() {
    }

    public GetMoviesEvent(int code, List<PopularMovie> movies, Throwable throwable) {
        this.code = code;
        this.movies = movies;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<PopularMovie> getMovies() {
        return movies;
    }

    public void setMovies(List<PopularMovie> movies) {
        this.movies = movies;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
