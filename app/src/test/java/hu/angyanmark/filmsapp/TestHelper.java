package hu.angyanmark.filmsapp;

import androidx.test.core.app.ApplicationProvider;
import org.robolectric.shadows.ShadowLog;

public class TestHelper {

    public static DaggerTestComponent setTestInjector() {
        ShadowLog.stream = System.out;
        App application = (App) ApplicationProvider.getApplicationContext();
        AppComponent injector = DaggerTestComponent.builder().testModule(new TestModule(application.getApplicationContext())).build();
        application.injector = injector;
        return (DaggerTestComponent) injector;
    }
}
