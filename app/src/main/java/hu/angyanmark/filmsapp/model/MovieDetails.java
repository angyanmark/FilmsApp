package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MovieDetails {

    @SerializedName("adult")
    private Boolean adult = null;

    @SerializedName("backdrop_path")
    private String backdropPath = null;

    @SerializedName("belongs_to_collection")
    private Object belongsToCollection = null;

    @SerializedName("budget")
    private Integer budget = null;

    @SerializedName("genres")
    private List<Genre> genres = new ArrayList<Genre>();

    @SerializedName("homepage")
    private String homepage = null;

    @SerializedName("id")
    private Integer id = null;

    @SerializedName("imdb_id")
    private String imdbId = null;

    @SerializedName("original_language")
    private String originalLanguage = null;

    @SerializedName("original_title")
    private String originalTitle = null;

    @SerializedName("overview")
    private String overview = null;

    @SerializedName("popularity")
    private Double popularity = null;

    @SerializedName("poster_path")
    private String posterPath = null;

    @SerializedName("production_companies")
    private List<ProductionCompany> productionCompanies = new ArrayList<ProductionCompany>();

    @SerializedName("production_countries")
    private List<ProductionCountry> productionCountries = new ArrayList<ProductionCountry>();

    @SerializedName("release_date")
    private String releaseDate = null;

    @SerializedName("revenue")
    private Integer revenue = null;

    @SerializedName("runtime")
    private Integer runtime = null;

    @SerializedName("spoken_languages")
    private List<SpokenLanguage> spokenLanguages = new ArrayList<SpokenLanguage>();

    @SerializedName("status")
    private String status = null;

    @SerializedName("tagline")
    private String tagline = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("video")
    private Boolean video = null;

    @SerializedName("vote_average")
    private Double voteAverage = null;

    @SerializedName("vote_count")
    private Integer voteCount = null;

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
    public String getBackdropPath() {
        return backdropPath;
    }
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    /**
     **/
    public Object getBelongsToCollection() {
        return belongsToCollection;
    }
    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    /**
     **/
    public Integer getBudget() {
        return budget;
    }
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    /**
     **/
    public List<Genre> getGenres() {
        return genres;
    }
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    /**
     **/
    public String getHomepage() {
        return homepage;
    }
    public void setHomepage(String homepage) {
        this.homepage = homepage;
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
    public String getImdbId() {
        return imdbId;
    }
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
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
    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
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
    public Double getPopularity() {
        return popularity;
    }
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

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
    public List<ProductionCompany> getProductionCompanies() {
        return productionCompanies;
    }
    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    /**
     **/
    public List<ProductionCountry> getProductionCountries() {
        return productionCountries;
    }
    public void setProductionCountries(List<ProductionCountry> productionCountries) {
        this.productionCountries = productionCountries;
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
    public Integer getRevenue() {
        return revenue;
    }
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    /**
     **/
    public Integer getRuntime() {
        return runtime;
    }
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    /**
     **/
    public List<SpokenLanguage> getSpokenLanguages() {
        return spokenLanguages;
    }
    public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    /**
     **/
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     **/
    public String getTagline() {
        return tagline;
    }
    public void setTagline(String tagline) {
        this.tagline = tagline;
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

    /**
     **/
    public Integer getVoteCount() {
        return voteCount;
    }
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MovieDetails movieDetails = (MovieDetails) o;
        return Objects.equals(adult, movieDetails.adult) &&
                Objects.equals(backdropPath, movieDetails.backdropPath) &&
                Objects.equals(belongsToCollection, movieDetails.belongsToCollection) &&
                Objects.equals(budget, movieDetails.budget) &&
                Objects.equals(genres, movieDetails.genres) &&
                Objects.equals(homepage, movieDetails.homepage) &&
                Objects.equals(id, movieDetails.id) &&
                Objects.equals(imdbId, movieDetails.imdbId) &&
                Objects.equals(originalLanguage, movieDetails.originalLanguage) &&
                Objects.equals(originalTitle, movieDetails.originalTitle) &&
                Objects.equals(overview, movieDetails.overview) &&
                Objects.equals(popularity, movieDetails.popularity) &&
                Objects.equals(posterPath, movieDetails.posterPath) &&
                Objects.equals(productionCompanies, movieDetails.productionCompanies) &&
                Objects.equals(productionCountries, movieDetails.productionCountries) &&
                Objects.equals(releaseDate, movieDetails.releaseDate) &&
                Objects.equals(revenue, movieDetails.revenue) &&
                Objects.equals(runtime, movieDetails.runtime) &&
                Objects.equals(spokenLanguages, movieDetails.spokenLanguages) &&
                Objects.equals(status, movieDetails.status) &&
                Objects.equals(tagline, movieDetails.tagline) &&
                Objects.equals(title, movieDetails.title) &&
                Objects.equals(video, movieDetails.video) &&
                Objects.equals(voteAverage, movieDetails.voteAverage) &&
                Objects.equals(voteCount, movieDetails.voteCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adult, backdropPath, belongsToCollection, budget, genres, homepage, id, imdbId, originalLanguage, originalTitle, overview, popularity, posterPath, productionCompanies, productionCountries, releaseDate, revenue, runtime, spokenLanguages, status, tagline, title, video, voteAverage, voteCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MovieDetails {\n");

        sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
        sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
        sb.append("    belongsToCollection: ").append(toIndentedString(belongsToCollection)).append("\n");
        sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
        sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imdbId: ").append(toIndentedString(imdbId)).append("\n");
        sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
        sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
        sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
        sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
        sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
        sb.append("    productionCompanies: ").append(toIndentedString(productionCompanies)).append("\n");
        sb.append("    productionCountries: ").append(toIndentedString(productionCountries)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    spokenLanguages: ").append(toIndentedString(spokenLanguages)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tagline: ").append(toIndentedString(tagline)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
        sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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
