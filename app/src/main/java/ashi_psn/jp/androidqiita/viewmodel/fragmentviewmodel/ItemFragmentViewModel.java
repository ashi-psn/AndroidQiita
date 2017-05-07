package ashi_psn.jp.androidqiita.viewmodel.fragmentviewmodel;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.util.Log;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.AfterReadingRepository;
import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.ItemQuery;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.usecase.ItemUseCase;
import ashi_psn.jp.androidqiita.view.fragment.BaseFragment;
import ashi_psn.jp.androidqiita.view.fragment.ItemFragment;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ashi_psn on 2017/04/30.
 */

public class ItemFragmentViewModel extends BaseFragmentViewModel {
    private final ItemUseCase itemUseCase;
    public ObservableArrayList<Item> items = new ObservableArrayList<>();
    public ItemFragment.DataSource sorce;
    public ObservableBoolean isloading = new ObservableBoolean();

    @Inject
    public ItemFragmentViewModel(BaseFragment fragment, ItemUseCase itemUseCase) {
        super(fragment);
        this.itemUseCase = itemUseCase;
        this.items = new ObservableArrayList<>();
    }

    @Override
    public void onStart() {
        loadItems();
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    public void loadItems(){
        loadItems((ItemQuery)new ItemQuery.Builder().build());
    }

    private void loadItems(ItemQuery query) {
        isloading.set(true);
        itemUseCase.getItems(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(items -> {
                    this.items.addAll(items);
                }, throwable -> {
                    Log.d("", "");
                }, () -> {
                    isloading.set(false);
                });
    }

    public void onRefresh() {
        items.clear();
        loadItems();
    }
}
