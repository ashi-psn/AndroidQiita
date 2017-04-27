package ashi_psn.jp.androidqiita.view.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableList;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import ashi_psn.jp.androidqiita.BR;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.R;

/**
 * Created by ashi_psn on 2017/04/26.
 */

public class ItemRecyclerViewAdapter extends RecyclerView.Adapter<ItemRecyclerViewAdapter.ItemViewHolder> {

    private ObservableList<Item> items;

    public ItemRecyclerViewAdapter(ObservableList<Item> items){
        this.items = items;
        this.items.addOnListChangedCallback(new ObservableList.OnListChangedCallback<ObservableList<Item>>() {
            @Override
            public void onChanged(ObservableList<Item> items) {
                notifyDataSetChanged();
            }

            @Override
            public void onItemRangeChanged(ObservableList<Item> items, int positionStart, int itemCount) {
                notifyItemRangeChanged(positionStart, itemCount);
            }

            @Override
            public void onItemRangeInserted(ObservableList<Item> items, int positionStart, int itemCount) {
                notifyItemRangeInserted(positionStart, itemCount);
            }

            @Override
            public void onItemRangeMoved(ObservableList<Item> items, int fromPosition, int toPosition, int itemCount) {
                notifyItemRangeRemoved(fromPosition, itemCount);
                notifyItemRangeInserted(toPosition, itemCount);
            }

            @Override
            public void onItemRangeRemoved(ObservableList<Item> items, int positionStart, int itemCount) {
                notifyItemRangeRemoved(positionStart, itemCount);
            }
        });
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_item, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Item item = items.get(position);
        holder.getBinding().setVariable(BR.item, item);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return items.size();
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
