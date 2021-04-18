package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PopularMoviesResponse   {

    @SerializedName("page")
    private Integer page = null;

    @SerializedName("results")
    private List<PopularMovie> results = new ArrayList<PopularMovie>();

    @SerializedName("total_results")
    private Integer totalResults = null;

    @SerializedName("total_pages")
    private Integer totalPages = null;

    /**
     **/
    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     **/
    public List<PopularMovie> getResults() {
        return results;
    }
    public void setResults(List<PopularMovie> results) {
        this.results = results;
    }

    /**
     **/
    public Integer getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     **/
    public Integer getTotalPages() {
        return totalPages;
    }
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PopularMoviesResponse popularMoviesResponse = (PopularMoviesResponse) o;
        return Objects.equals(page, popularMoviesResponse.page) &&
                Objects.equals(results, popularMoviesResponse.results) &&
                Objects.equals(totalResults, popularMoviesResponse.totalResults) &&
                Objects.equals(totalPages, popularMoviesResponse.totalPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, results, totalResults, totalPages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PopularMoviesResponse {\n");

        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

