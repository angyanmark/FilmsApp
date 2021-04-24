package hu.angyanmark.filmsapp.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import hu.angyanmark.filmsapp.model.PopularMovie;

@Database(
        entities = {PopularMovie.class},
        version = 1,
        exportSchema = false
)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MovieDao movieDao();
}

