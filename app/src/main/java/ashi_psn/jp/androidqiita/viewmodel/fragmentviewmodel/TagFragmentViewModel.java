package ashi_psn.jp.androidqiita.viewmodel.fragmentviewmodel;

import android.databinding.ObservableArrayList;
import android.util.Log;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.ItemQuery;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.repository.api.response.Tag;
import ashi_psn.jp.androidqiita.model.usecase.ItemUseCase;
import ashi_psn.jp.androidqiita.model.usecase.TagUseCase;
import ashi_psn.jp.androidqiita.view.fragment.BaseFragment;
import ashi_psn.jp.androidqiita.view.fragment.ItemFragment;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ashi_psn on 2017/04/30.
 */

public class TagFragmentViewModel extends BaseFragmentViewModel {
    private final TagUseCase tagUseCase;
    public ObservableArrayList<Tag> tags = new ObservableArrayList<>();
    public ItemFragment.DataSource sorce;

    @Inject
    public TagFragmentViewModel(BaseFragment fragment , TagUseCase tagUseCase) {
        super(fragment);
        this.tagUseCase = tagUseCase;
        this.tags = new ObservableArrayList<>();
    }

    @Override
    public void onStart() {
        ItemQuery query = (ItemQuery) new ItemQuery.Builder().build();
        tagUseCase.getTags()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(items -> {
                    this.tags.addAll(items);
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

    public void onRefresh(){
        Log.d("","");
    }
}
