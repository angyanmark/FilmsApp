package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class BelongsToCollection   {

    @SerializedName("id")
    private Integer id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("poster_path")
    private String posterPath = null;

    @SerializedName("backdrop_path")
    private String backdropPath = null;

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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getBackdropPath() {
        return backdropPath;
    }
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BelongsToCollection belongsToCollection = (BelongsToCollection) o;
        return Objects.equals(id, belongsToCollection.id) &&
                Objects.equals(name, belongsToCollection.name) &&
                Objects.equals(posterPath, belongsToCollection.posterPath) &&
                Objects.equals(backdropPath, belongsToCollection.backdropPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, posterPath, backdropPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BelongsToCollection {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
        sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
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

