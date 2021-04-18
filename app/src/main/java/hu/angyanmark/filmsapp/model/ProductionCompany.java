package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class ProductionCompany   {

    @SerializedName("name")
    private String name = null;

    @SerializedName("id")
    private Integer id = null;

    @SerializedName("logo_path")
    private String logoPath = null;

    @SerializedName("origin_country")
    private String originCountry = null;

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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     **/
    public String getLogoPath() {
        return logoPath;
    }
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    /**
     **/
    public String getOriginCountry() {
        return originCountry;
    }
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductionCompany productionCompany = (ProductionCompany) o;
        return Objects.equals(name, productionCompany.name) &&
                Objects.equals(id, productionCompany.id) &&
                Objects.equals(logoPath, productionCompany.logoPath) &&
                Objects.equals(originCountry, productionCompany.originCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, logoPath, originCountry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductionCompany {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
        sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
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

