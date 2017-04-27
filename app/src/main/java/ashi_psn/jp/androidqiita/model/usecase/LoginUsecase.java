package ashi_psn.jp.androidqiita.model.usecase;

import android.content.Intent;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.response.TokenResponse;
import ashi_psn.jp.androidqiita.model.repository.LoginRepository;
import ashi_psn.jp.androidqiita.model.repository.QiitaAPIRepository;
import ashi_psn.jp.androidqiita.view.activity.BaseActivity;
import ashi_psn.jp.androidqiita.view.activity.HomeActivity;
import rx.Single;

public class LoginUsecase {


    private final LoginRepository loginrepository;
    private final BaseActivity activity;
    private final QiitaAPIRepository apiRepository;

    @Inject
    public LoginUsecase(BaseActivity activity,LoginRepository loginrepository,QiitaAPIRepository apiRepository){
        this.activity = activity;
        this.loginrepository = loginrepository;
        this.apiRepository = apiRepository;
    }

    public Boolean isLogin(){
        return loginrepository.checkLogin();
    }

    public void login(){
        Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    public void authentication(){
        loginrepository.authentication();
    }

    public Single<TokenResponse> authorization(String code){
        return apiRepository.getAccessToken(code);
    }
    public void saveToken(TokenResponse tokenResponse){
        loginrepository.saveToken(tokenResponse);
    }
}
