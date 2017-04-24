package ashi_psn.jp.androidqiita.Model.Repository;

import android.content.Context;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;


import ashi_psn.jp.androidqiita.Model.Repository.API.Request.QiitaAPI;
import ashi_psn.jp.androidqiita.Model.Repository.API.Request.RequestBody.Authorization;
import ashi_psn.jp.androidqiita.Model.Repository.API.Response.TokenResponse;
import ashi_psn.jp.androidqiita.Model.Repository.DAO.UserDAO;
import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.View.Activity.BaseActivity;
import rx.Single;

/**
 * Created by ashi_psn on 2017/04/21.
 */

public class LoginRepository extends BaseRepository<String,TokenResponse> {


    private final BaseActivity activity;
    private final UserDAO userDAO;

    @Inject
    public LoginRepository(BaseActivity activity,UserDAO userDAO){
        this.activity = activity;
        this.userDAO = userDAO;
    }

    public Boolean checkLogin(){
        String a = userDAO.getToken();
        return userDAO.getToken() != null ? true : false;
    }

    public void authentication(){
        String url = activity.getString(R.string.authorization_endpoint) +
                "?client_id=" + activity.getString(R.string.client_id) +
                "&scope=read_qiita+write_qiita&state=bb17785d811bb1913ef54b0a7657de780defaa2d";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(activity, Uri.parse(url));
    }

    public void saveToken(TokenResponse tokenResponse){
        userDAO.saveToken(tokenResponse);
    }

}
