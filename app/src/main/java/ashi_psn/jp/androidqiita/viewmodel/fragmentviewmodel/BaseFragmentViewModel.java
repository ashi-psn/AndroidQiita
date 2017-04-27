package ashi_psn.jp.androidqiita.viewmodel.fragmentviewmodel;

import android.content.Context;
import android.support.annotation.NonNull;

import com.trello.rxlifecycle.LifecycleTransformer;

import ashi_psn.jp.androidqiita.view.fragment.BaseFragment;

/**
 * Created by ashi_psn on 2017/04/18.
 */

public abstract class BaseFragmentViewModel {
    private final BaseFragment fragment;

    public BaseFragmentViewModel(BaseFragment fragment) {
        this.fragment = fragment;
    }

    @Deprecated
    public BaseFragment getFragment() {
        return fragment;
    }

    @NonNull
    public Context getContext() {
        if (fragment != null) {
            return fragment.getContext();
        }
        throw new IllegalStateException("No view attached");
    }

    @NonNull
    public final <T> LifecycleTransformer<T> bindToLifecycle() {
        if (fragment != null) {
            return fragment.bindToLifecycle();
        }
        throw new IllegalStateException("No view attached");
    }

    public abstract void onStart();

    public abstract void onResume();

    public abstract void onPause();

    public abstract void onStop();
}
