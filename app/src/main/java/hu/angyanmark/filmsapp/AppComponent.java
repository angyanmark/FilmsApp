package hu.angyanmark.filmsapp;

import javax.inject.Singleton;

import dagger.Component;
import hu.angyanmark.filmsapp.interactor.movies.MoviesInteractor;
import hu.angyanmark.filmsapp.network.NetworkModule;
import hu.angyanmark.filmsapp.ui.UIModule;
import hu.angyanmark.filmsapp.ui.details.ItemDetailFragment;
import hu.angyanmark.filmsapp.ui.details.ItemDetailPresenter;
import hu.angyanmark.filmsapp.ui.list.ItemListActivity;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(ItemListActivity mainActivity);

    void inject(ItemDetailFragment itemDetailFragment);

    void inject(MoviesInteractor moviesInteractor);

    void inject(ItemDetailPresenter itemDetailPresenter);
}
