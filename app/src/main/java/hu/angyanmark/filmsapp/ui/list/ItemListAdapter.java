package hu.angyanmark.filmsapp.ui.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hu.angyanmark.filmsapp.R;
import hu.angyanmark.filmsapp.model.PopularMovie;
import hu.angyanmark.filmsapp.ui.details.ItemDetailActivity;
import hu.angyanmark.filmsapp.ui.details.ItemDetailFragment;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder> {

    private final ItemListActivity mParentActivity;
    private final List<PopularMovie> mMovies;
    private final boolean mTwoPane;
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            PopularMovie item = (PopularMovie) view.getTag();
            if (mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putString(ItemDetailFragment.ARG_ITEM_ID, item.getId().toString());
                ItemDetailFragment fragment = new ItemDetailFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.item_detail_container, fragment)
                        .commit();
            } else {
                Context context = view.getContext();
                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra(ItemDetailFragment.ARG_ITEM_ID, item.getId().toString());

                context.startActivity(intent);
            }
        }
    };

    ItemListAdapter(ItemListActivity parent, List<PopularMovie> movies, boolean twoPane) {
        mMovies = movies;
        mParentActivity = parent;
        mTwoPane = twoPane;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mTitleReleaseDateView.setText(mMovies.get(position).getTitle() + " (" + mMovies.get(position).getReleaseDate() + ")");
        holder.mVoteAverageView.setText(mMovies.get(position).getVoteAverage().toString());

        holder.itemView.setTag(mMovies.get(position));
        holder.itemView.setOnClickListener(mOnClickListener);
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView mTitleReleaseDateView;
        final TextView mVoteAverageView;

        ViewHolder(View view) {
            super(view);
            mTitleReleaseDateView = (TextView) view.findViewById(R.id.title_release_date);
            mVoteAverageView = (TextView) view.findViewById(R.id.vote_average);
        }
    }
}
