package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PopularMoviesResponse   {

    @SerializedName("page")
    private Integer page = null;

    @SerializedName("results")
    private List<PopularMovie> results = new ArrayList<PopularMovie>();

    @SerializedName("total_results")
    private Integer totalResults = null;

    @SerializedName("total_pages")
    private Integer totalPages = null;

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public List<PopularMovie> getResults() {
        return results;
    }
    public void setResults(List<PopularMovie> results) {
        this.results = results;
    }

    public Integer getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}

