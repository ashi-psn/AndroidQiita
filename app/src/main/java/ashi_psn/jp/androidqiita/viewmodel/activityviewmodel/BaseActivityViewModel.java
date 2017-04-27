package ashi_psn.jp.androidqiita.viewmodel.activityviewmodel;

import ashi_psn.jp.androidqiita.view.activity.BaseActivity;

import android.content.Context;
import android.support.annotation.NonNull;

import com.trello.rxlifecycle.LifecycleTransformer;


/**
 * Created by ashi_psn on 2017/04/18.
 */

public abstract class BaseActivityViewModel {
    private final BaseActivity activity;

    public BaseActivityViewModel(BaseActivity activity){
        this.activity = activity;
    }

    @NonNull
    public BaseActivity getActivity(){
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("No view attached");
    }

    @NonNull
    public Context getContext() {
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("No view attached");
    }

    @NonNull
    public final <T> LifecycleTransformer<T> bindToLifecycle() {
        if (activity != null) {
            return activity.bindToLifecycle();
        }
        throw new IllegalStateException("No view attached");
    }

    public abstract void onStart();

    public abstract void onResume();

    public abstract void onPause();

    public abstract void onStop();
}

