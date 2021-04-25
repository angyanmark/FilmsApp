package hu.angyanmark.filmsapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "popularmovie")
public class PopularMovie   {

    @ColumnInfo(name = "poster_path")
    @SerializedName("poster_path")
    private String posterPath = null;

    @ColumnInfo(name = "adult")
    @SerializedName("adult")
    private Boolean adult = null;

    @ColumnInfo(name = "overview")
    @SerializedName("overview")
    private String overview = null;

    @ColumnInfo(name = "release_date")
    @SerializedName("release_date")
    private String releaseDate = null;

    @Ignore
    @SerializedName("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = false)
    @SerializedName("id")
    private Integer id = null;

    @ColumnInfo(name = "original_title")
    @SerializedName("original_title")
    private String originalTitle = null;

    @ColumnInfo(name = "original_language")
    @SerializedName("original_language")
    private String originalLanguage = null;

    @ColumnInfo(name = "title")
    @SerializedName("title")
    private String title = null;

    @ColumnInfo(name = "backdrop_path")
    @SerializedName("backdrop_path")
    private String backdropPath = null;

    @ColumnInfo(name = "popularity")
    @SerializedName("popularity")
    private Double popularity = null;

    @ColumnInfo(name = "vote_count")
    @SerializedName("vote_count")
    private Integer voteCount = null;

    @ColumnInfo(name = "video")
    @SerializedName("video")
    private Boolean video = null;

    @ColumnInfo(name = "vote_average")
    @SerializedName("vote_average")
    private Double voteAverage = null;

    public String getPosterPath() {
        return posterPath;
    }
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Boolean getAdult() {
        return adult;
    }
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }
    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Double getPopularity() {
        return popularity;
    }
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Integer getVoteCount() {
        return voteCount;
    }
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Boolean getVideo() {
        return video;
    }
    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }
}

