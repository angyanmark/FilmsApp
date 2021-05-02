package hu.angyanmark.filmsapp.mock;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import dagger.Module;
import dagger.Provides;
import hu.angyanmark.filmsapp.App;
import hu.angyanmark.filmsapp.data.AppDatabase;
import javax.inject.Singleton;

@Module
public class MockDatabaseModule {
    @Provides
    @Singleton
    public AppDatabase providesDatabase() {
        return Room.inMemoryDatabaseBuilder((App) ApplicationProvider.getApplicationContext(), AppDatabase.class).allowMainThreadQueries().build();
    }
}
