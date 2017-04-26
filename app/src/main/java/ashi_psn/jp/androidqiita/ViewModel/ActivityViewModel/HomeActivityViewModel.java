package ashi_psn.jp.androidqiita.ViewModel.ActivityViewModel;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.util.Log;
import android.view.View;

import java.util.HashMap;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.Model.Repository.API.Request.RequestBody.ItemQuery;

import ashi_psn.jp.androidqiita.Model.Repository.API.Response.Item;
import ashi_psn.jp.androidqiita.Model.Repository.AfterReadingRepository;
import ashi_psn.jp.androidqiita.Model.Repository.DAO.Entity.AfterReading;
import ashi_psn.jp.androidqiita.Model.Usecase.AfterReadingUseCase;
import ashi_psn.jp.androidqiita.Model.Usecase.ItemUseCase;
import ashi_psn.jp.androidqiita.View.Activity.BaseActivity;
import ashi_psn.jp.androidqiita.View.Activity.HomeActivity;
import io.realm.Realm;
import io.realm.RealmResults;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class HomeActivityViewModel extends BaseActivityViewModel {

    private final ItemUseCase itemUseCase;
    private final AfterReadingUseCase afterReadingUseCase;
    public ObservableArrayList<Item> items;

    @Inject
    public HomeActivityViewModel(BaseActivity activity,ItemUseCase itemUseCase,AfterReadingUseCase afterReadingUseCase) {
        super(activity);
        this.itemUseCase = itemUseCase;
        this.afterReadingUseCase = afterReadingUseCase;
        this.items = new ObservableArrayList<>();
    }

    public void getItems(View v) {
        /*
        ItemQuery query = (ItemQuery) new ItemQuery.Builder().build();
        itemUseCase.getItems(query).compose(getActivity().bindToLifecycle().forSingle())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(items -> {
                    Log.d("","");
                }, throwable -> {
                    Log.d("", "");
                });
        */
    }

    @Override
    public void onStart() {
        ItemQuery query = (ItemQuery) new ItemQuery.Builder().build();
        itemUseCase.getItems(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(items ->{

                }).subscribe(items -> {
                    this.items.addAll(items);
                    items.forEach(item -> {
                        item.getTags().forEach(tagbean ->{

                        });
                    });
                }, throwable -> {
                    Log.d("", "");
                });
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
}
