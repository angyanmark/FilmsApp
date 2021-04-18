package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class ProductionCountry   {

    @SerializedName("iso_3166_1")
    private String iso31661 = null;

    @SerializedName("name")
    private String name = null;

    /**
     **/
    public String getIso31661() {
        return iso31661;
    }
    public void setIso31661(String iso31661) {
        this.iso31661 = iso31661;
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
        ProductionCountry productionCountry = (ProductionCountry) o;
        return Objects.equals(iso31661, productionCountry.iso31661) &&
                Objects.equals(name, productionCountry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iso31661, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductionCountry {\n");

        sb.append("    iso31661: ").append(toIndentedString(iso31661)).append("\n");
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

