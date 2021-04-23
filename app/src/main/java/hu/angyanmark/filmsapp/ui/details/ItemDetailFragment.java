package hu.angyanmark.filmsapp.ui.details;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import hu.angyanmark.filmsapp.App;
import hu.angyanmark.filmsapp.model.MovieDetails;
import hu.angyanmark.filmsapp.ui.list.ItemListActivity;
import hu.angyanmark.filmsapp.R;
import hu.angyanmark.filmsapp.model.Dummy;

public class ItemDetailFragment extends Fragment implements ItemDetailScreen {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    @Inject
    ItemDetailPresenter itemDetailPresenter;

    /**
     * The dummy content this fragment is presenting.
     */
    private Dummy.DummyItem mItem;

    private MovieDetails movie;

    public ItemDetailFragment() {
        App.injector.inject(this);
    }

    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
        itemDetailPresenter.attachScreen(this);
    }

    @Override
    public void onDetach() {
        itemDetailPresenter.detachScreen();
        super.onDetach();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = Dummy.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.details);
        }

        return rootView;
    }

    @Override
    public void showMovie(MovieDetails movie) {

    }

    @Override
    public void showNetworkError(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }
}