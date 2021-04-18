package hu.angyanmark.filmsapp;

import javax.inject.Singleton;

import dagger.Component;
import hu.angyanmark.filmsapp.interactor.InteractorModule;
import hu.angyanmark.filmsapp.interactor.movies.MoviesInteractor;
import hu.angyanmark.filmsapp.network.NetworkModule;
import hu.angyanmark.filmsapp.ui.UIModule;
import hu.angyanmark.filmsapp.ui.details.ItemDetailFragment;
import hu.angyanmark.filmsapp.ui.details.ItemDetailPresenter;
import hu.angyanmark.filmsapp.ui.list.ItemListActivity;
import hu.angyanmark.filmsapp.ui.list.ItemListPresenter;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class, InteractorModule.class})
public interface AppComponent {
    void inject(ItemListActivity itemListActivity);

    void inject(ItemDetailFragment itemDetailFragment);

    void inject(MoviesInteractor moviesInteractor);

    void inject(ItemDetailPresenter itemDetailPresenter);

    void inject(ItemListPresenter itemListPresenter);
}
