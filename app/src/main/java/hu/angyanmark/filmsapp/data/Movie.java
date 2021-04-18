package hu.angyanmark.filmsapp.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "movie")
public class Movie {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = false)
    public Long id;

    @ColumnInfo(name = "title")
    public String title;

    @ColumnInfo(name = "releaseDate")
    public String releaseDate;

    @ColumnInfo(name = "rating")
    public double rating;

    @ColumnInfo(name = "runtime")
    public int runtime;

    @ColumnInfo(name="budget")
    public int budget;

    @ColumnInfo(name = "overview")
    public String overview;
}
