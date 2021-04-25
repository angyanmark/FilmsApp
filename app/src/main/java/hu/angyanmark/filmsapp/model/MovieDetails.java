package hu.angyanmark.filmsapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "moviedetail")
public class MovieDetails {

    @ColumnInfo(name = "adult")
    @SerializedName("adult")
    private Boolean adult = null;

    @ColumnInfo(name = "backdrop_path")
    @SerializedName("backdrop_path")
    private String backdropPath = null;

    @Ignore
    @SerializedName("belongs_to_collection")
    private Object belongsToCollection = null;

    @ColumnInfo(name = "budget")
    @SerializedName("budget")
    private Integer budget = null;

    @Ignore
    @SerializedName("genres")
    private List<Genre> genres = new ArrayList<Genre>();

    @ColumnInfo(name = "homepage")
    @SerializedName("homepage")
    private String homepage = null;

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = false)
    @SerializedName("id")
    private Integer id = null;

    @ColumnInfo(name = "imdb_id")
    @SerializedName("imdb_id")
    private String imdbId = null;

    @ColumnInfo(name = "original_language")
    @SerializedName("original_language")
    private String originalLanguage = null;

    @ColumnInfo(name = "original_title")
    @SerializedName("original_title")
    private String originalTitle = null;

    @ColumnInfo(name = "overview")
    @SerializedName("overview")
    private String overview = null;

    @ColumnInfo(name = "popularity")
    @SerializedName("popularity")
    private Double popularity = null;

    @ColumnInfo(name = "poster_path")
    @SerializedName("poster_path")
    private String posterPath = null;

    @Ignore
    @SerializedName("production_companies")
    private List<ProductionCompany> productionCompanies = new ArrayList<ProductionCompany>();

    @Ignore
    @SerializedName("production_countries")
    private List<ProductionCountry> productionCountries = new ArrayList<ProductionCountry>();

    @ColumnInfo(name = "release_date")
    @SerializedName("release_date")
    private String releaseDate = null;

    @ColumnInfo(name = "revenue")
    @SerializedName("revenue")
    private Integer revenue = null;

    @ColumnInfo(name = "runtime")
    @SerializedName("runtime")
    private Integer runtime = null;

    @Ignore
    @SerializedName("spoken_languages")
    private List<SpokenLanguage> spokenLanguages = new ArrayList<SpokenLanguage>();

    @ColumnInfo(name = "status")
    @SerializedName("status")
    private String status = null;

    @ColumnInfo(name = "tagline")
    @SerializedName("tagline")
    private String tagline = null;

    @ColumnInfo(name = "title")
    @SerializedName("title")
    private String title = null;

    @ColumnInfo(name = "video")
    @SerializedName("video")
    private Boolean video = null;

    @ColumnInfo(name = "vote_average")
    @SerializedName("vote_average")
    private Double voteAverage = null;

    @ColumnInfo(name = "vote_count")
    @SerializedName("vote_count")
    private Integer voteCount = null;

    public Boolean getAdult() {
        return adult;
    }
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Object getBelongsToCollection() {
        return belongsToCollection;
    }
    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    public Integer getBudget() {
        return budget;
    }
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public List<Genre> getGenres() {
        return genres;
    }
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public String getHomepage() {
        return homepage;
    }
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Double getPopularity() {
        return popularity;
    }
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public List<ProductionCompany> getProductionCompanies() {
        return productionCompanies;
    }
    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public List<ProductionCountry> getProductionCountries() {
        return productionCountries;
    }
    public void setProductionCountries(List<ProductionCountry> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getRevenue() {
        return revenue;
    }
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public List<SpokenLanguage> getSpokenLanguages() {
        return spokenLanguages;
    }
    public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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

    public Integer getVoteCount() {
        return voteCount;
    }
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}
