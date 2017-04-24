package ashi_psn.jp.androidqiita.Model.Usecase;

import android.content.Intent;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.Model.Repository.API.Request.QiitaAPI;
import ashi_psn.jp.androidqiita.Model.Repository.API.Response.TokenResponse;
import ashi_psn.jp.androidqiita.Model.Repository.LoginRepository;
import ashi_psn.jp.androidqiita.Model.Repository.QiitaAPIRepository;
import ashi_psn.jp.androidqiita.View.Activity.BaseActivity;
import ashi_psn.jp.androidqiita.View.Activity.HomeActivity;
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
