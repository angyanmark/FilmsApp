package hu.angyanmark.filmsapp;

import android.app.Application;

import hu.angyanmark.filmsapp.ui.UIModule;

public class App extends Application {
    public static AppComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerAppComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }
}
