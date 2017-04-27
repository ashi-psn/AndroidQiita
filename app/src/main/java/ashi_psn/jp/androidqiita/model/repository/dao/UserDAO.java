package ashi_psn.jp.androidqiita.model.repository.dao;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

import ashi_psn.jp.androidqiita.model.repository.api.response.TokenResponse;

/**
 * Created by ashi_psn on 2017/04/22.
 */
@Singleton
public class UserDAO {

    private final Context context;

    @Inject
    public UserDAO(Context context){
        this.context = context;
    }

    public void saveToken(TokenResponse token){
        SharedPreferences preferences = context.getSharedPreferences("userData",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("token",token.getToken());
        editor.commit();
    }

    public String getToken(){
        SharedPreferences preferences = context.getSharedPreferences("userData",Context.MODE_PRIVATE);
        return preferences.getString("token",null);
    }
}
