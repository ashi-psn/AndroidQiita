package ashi_psn.jp.androidqiita.viewmodel.activityviewmodel;

import android.databinding.ObservableArrayList;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.ItemQuery;

import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.usecase.AfterReadingUseCase;
import ashi_psn.jp.androidqiita.model.usecase.ItemUseCase;
import ashi_psn.jp.androidqiita.view.activity.BaseActivity;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class HomeActivityViewModel extends BaseActivityViewModel {

    private final ItemUseCase itemUseCase;
    private final AfterReadingUseCase afterReadingUseCase;

    @Inject
    public HomeActivityViewModel(BaseActivity activity, ItemUseCase itemUseCase, AfterReadingUseCase afterReadingUseCase) {
        super(activity);
        this.itemUseCase = itemUseCase;
        this.afterReadingUseCase = afterReadingUseCase;
    }

    public void getItems(View v) {

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
