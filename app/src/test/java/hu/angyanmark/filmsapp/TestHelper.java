package hu.angyanmark.filmsapp;

import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;

public class TestHelper {

    /*public static DaggerTestComponent setTestInjector() {
        ShadowLog.stream = System.out;
        App application = (App) RuntimeEnvironment.application;
        AppComponent injector = DaggerTestComponent.builder().testModule(new TestModule(application.getApplicationContext())).build();
        application.injector = injector;
        return (DaggerTestComponent) injector;
    }*/
}
