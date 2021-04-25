package hu.angyanmark.filmsapp.model;

import com.google.gson.annotations.SerializedName;

public class ProductionCompany   {

    @SerializedName("name")
    private String name = null;

    @SerializedName("id")
    private Integer id = null;

    @SerializedName("logo_path")
    private String logoPath = null;

    @SerializedName("origin_country")
    private String originCountry = null;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogoPath() {
        return logoPath;
    }
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getOriginCountry() {
        return originCountry;
    }
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}

