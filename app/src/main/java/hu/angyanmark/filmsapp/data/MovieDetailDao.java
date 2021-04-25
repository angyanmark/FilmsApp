package hu.angyanmark.filmsapp.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import hu.angyanmark.filmsapp.model.MovieDetails;

@Dao
public interface MovieDetailDao {
    @Query("SELECT * FROM moviedetail WHERE :id == id")
    MovieDetails getMovie(Integer id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(MovieDetails movie);

    @Delete
    void delete(MovieDetails movie);
}
