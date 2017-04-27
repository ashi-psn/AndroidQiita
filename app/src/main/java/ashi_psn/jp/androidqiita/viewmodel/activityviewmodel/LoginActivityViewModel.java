package ashi_psn.jp.androidqiita.viewmodel.activityviewmodel;

import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.usecase.LoginUsecase;
import ashi_psn.jp.androidqiita.view.activity.BaseActivity;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ashi_psn on 2017/04/18.
 */

public class LoginActivityViewModel extends BaseActivityViewModel {

    private final LoginUsecase usecase;

    @Inject
    public LoginActivityViewModel(BaseActivity activity, LoginUsecase usecase) {
        super(activity);
        this.usecase = usecase;
    }

    public void login(View v) {
        usecase.authentication();
    }

    public void authenticationCallback(String code) {

        usecase.authorization(code)
                .compose(getActivity().bindToLifecycle().forSingle())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(tokenResponse -> {
                    usecase.saveToken(tokenResponse);
                    usecase.login();
                }, throwable -> {
                    Log.d("", "");
                });
    }

    /**
     * ログイン済みの場合はホーム画面へ遷移する
     */
    @Override
    public void onStart() {
        if (usecase.isLogin()) {
            usecase.login();
        }
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
