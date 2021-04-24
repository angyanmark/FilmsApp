package hu.angyanmark.filmsapp.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import hu.angyanmark.filmsapp.model.PopularMovie;

@Dao
public interface MovieDao {
    @Query("SELECT * FROM popularmovie")
    List<PopularMovie> getAllMovies();

    @Query("DELETE FROM popularmovie")
    void deleteAllMovies();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(PopularMovie movie);

    @Update
    void update(PopularMovie movie);

    @Delete
    void delete(PopularMovie movie);
}
