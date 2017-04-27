package ashi_psn.jp.androidqiita.model.repository;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;

import javax.inject.Inject;


import ashi_psn.jp.androidqiita.model.repository.api.response.TokenResponse;
import ashi_psn.jp.androidqiita.model.repository.dao.UserDAO;
import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.view.activity.BaseActivity;

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
