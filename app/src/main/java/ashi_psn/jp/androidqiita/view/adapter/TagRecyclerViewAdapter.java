package ashi_psn.jp.androidqiita.view.adapter;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableList;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import ashi_psn.jp.androidqiita.BR;
import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.repository.api.response.Tag;
import ashi_psn.jp.androidqiita.view.activity.ItemDetailActivity;

/**
 * Created by ashi_psn on 2017/04/26.
 */

public class TagRecyclerViewAdapter extends RecyclerView.Adapter<TagRecyclerViewAdapter.ItemViewHolder> {

    private ObservableList<Tag> tags;

    public TagRecyclerViewAdapter(ObservableList<Tag> items) {
        this.tags = items;
        this.tags.addOnListChangedCallback(new ObservableList.OnListChangedCallback<ObservableList<Tag>>() {
            @Override
            public void onChanged(ObservableList<Tag> items) {
                notifyDataSetChanged();
            }

            @Override
            public void onItemRangeChanged(ObservableList<Tag> items, int positionStart, int itemCount) {
                notifyItemRangeChanged(positionStart, itemCount);
            }

            @Override
            public void onItemRangeInserted(ObservableList<Tag> items, int positionStart, int itemCount) {
                notifyItemRangeInserted(positionStart, itemCount);
            }

            @Override
            public void onItemRangeMoved(ObservableList<Tag> items, int fromPosition, int toPosition, int itemCount) {
                notifyItemRangeRemoved(fromPosition, itemCount);
                notifyItemRangeInserted(toPosition, itemCount);
            }

            @Override
            public void onItemRangeRemoved(ObservableList<Tag> items, int positionStart, int itemCount) {
                notifyItemRangeRemoved(positionStart, itemCount);
            }
        });
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_tag, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Tag item = tags.get(position);
        holder.getBinding().setVariable(BR.tag, item);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return tags.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding mBinding;

        public ItemViewHolder(View v) {
            super(v);
            mBinding = DataBindingUtil.bind(v);
        }

        public ViewDataBinding getBinding() {
            return mBinding;
        }
    }
}
