package ashi_psn.jp.androidqiita.ViewModel.ActivityViewModel;

import android.util.Log;
import android.view.View;

import java.util.HashMap;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.Model.Repository.API.Request.RequestBody.ItemQuery;

import ashi_psn.jp.androidqiita.Model.Usecase.ItemUseCase;
import ashi_psn.jp.androidqiita.View.Activity.BaseActivity;
import ashi_psn.jp.androidqiita.View.Activity.HomeActivity;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class HomeActivityViewModel extends BaseActivityViewModel {

    private final ItemUseCase itemUseCase;

    @Inject
    public HomeActivityViewModel(BaseActivity activity, ItemUseCase itemUseCase) {
        super(activity);
        this.itemUseCase = itemUseCase;
    }

    public void getItems(View v) {
        ItemQuery query = (ItemQuery) new ItemQuery.Builder().build();
        itemUseCase.getItems(query).compose(getActivity().bindToLifecycle().forSingle())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(items -> {
                    Log.d("","");
                }, throwable -> {
                    Log.d("", "");
                });
    }

    @Override
    public void onStart() {

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
