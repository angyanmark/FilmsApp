package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PopularMovie   {

    @SerializedName("poster_path")
    private String posterPath = null;

    @SerializedName("adult")
    private Boolean adult = null;

    @SerializedName("overview")
    private String overview = null;

    @SerializedName("release_date")
    private String releaseDate = null;

    @SerializedName("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();

    @SerializedName("id")
    private Integer id = null;

    @SerializedName("original_title")
    private String originalTitle = null;

    @SerializedName("original_language")
    private String originalLanguage = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("backdrop_path")
    private String backdropPath = null;

    @SerializedName("popularity")
    private Double popularity = null;

    @SerializedName("vote_count")
    private Integer voteCount = null;

    @SerializedName("video")
    private Boolean video = null;

    @SerializedName("vote_average")
    private Double voteAverage = null;

    /**
     **/
    public String getPosterPath() {
        return posterPath;
    }
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    /**
     **/
    public Boolean getAdult() {
        return adult;
    }
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    /**
     **/
    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     **/
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     **/
    public List<Integer> getGenreIds() {
        return genreIds;
    }
    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    /**
     **/
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     **/
    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    /**
     **/
    public String getOriginalLanguage() {
        return originalLanguage;
    }
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    /**
     **/
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     **/
    public String getBackdropPath() {
        return backdropPath;
    }
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    /**
     **/
    public Double getPopularity() {
        return popularity;
    }
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    /**
     **/
    public Integer getVoteCount() {
        return voteCount;
    }
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    /**
     **/
    public Boolean getVideo() {
        return video;
    }
    public void setVideo(Boolean video) {
        this.video = video;
    }

    /**
     **/
    public Double getVoteAverage() {
        return voteAverage;
    }
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PopularMovie popularMovie = (PopularMovie) o;
        return Objects.equals(posterPath, popularMovie.posterPath) &&
                Objects.equals(adult, popularMovie.adult) &&
                Objects.equals(overview, popularMovie.overview) &&
                Objects.equals(releaseDate, popularMovie.releaseDate) &&
                Objects.equals(genreIds, popularMovie.genreIds) &&
                Objects.equals(id, popularMovie.id) &&
                Objects.equals(originalTitle, popularMovie.originalTitle) &&
                Objects.equals(originalLanguage, popularMovie.originalLanguage) &&
                Objects.equals(title, popularMovie.title) &&
                Objects.equals(backdropPath, popularMovie.backdropPath) &&
                Objects.equals(popularity, popularMovie.popularity) &&
                Objects.equals(voteCount, popularMovie.voteCount) &&
                Objects.equals(video, popularMovie.video) &&
                Objects.equals(voteAverage, popularMovie.voteAverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posterPath, adult, overview, releaseDate, genreIds, id, originalTitle, originalLanguage, title, backdropPath, popularity, voteCount, video, voteAverage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PopularMovie {\n");

        sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
        sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
        sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
        sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
        sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
        sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
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

