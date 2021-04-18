package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class SpokenLanguage   {

    @SerializedName("iso_639_1")
    private String iso6391 = null;

    @SerializedName("name")
    private String name = null;

    /**
     **/
    public String getIso6391() {
        return iso6391;
    }
    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    /**
     **/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpokenLanguage spokenLanguage = (SpokenLanguage) o;
        return Objects.equals(iso6391, spokenLanguage.iso6391) &&
                Objects.equals(name, spokenLanguage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iso6391, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpokenLanguage {\n");

        sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

