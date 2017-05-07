package ashi_psn.jp.androidqiita.viewmodel.activityviewmodel;

import android.databinding.ObservableArrayList;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.response.Comment;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.usecase.CommentUseCase;
import ashi_psn.jp.androidqiita.model.usecase.ItemUseCase;
import ashi_psn.jp.androidqiita.view.activity.BaseActivity;
import rx.Observable;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by ashi_psn on 2017/05/07.
 */

public class ItemDetailActivityViewModel extends BaseActivityViewModel {

    public ItemUseCase itemUseCase;
    CommentUseCase commentUseCase;
    public Item item;
    public ObservableArrayList<Comment> comments = new ObservableArrayList<>();

    @Inject
    public ItemDetailActivityViewModel(BaseActivity activity, ItemUseCase itemUseCase, CommentUseCase commentUseCase) {
        super(activity);
        this.itemUseCase = itemUseCase;
        this.commentUseCase = commentUseCase;
    }

    @Override
    public void onStart() {
        loadComments();
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

    public void loadComments(){
        commentUseCase.getComments(item.getId())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(comments -> {
                    this.comments.addAll(comments);
                }, throwable -> {
                    Log.e("",throwable.getMessage());
                });

    }
}
