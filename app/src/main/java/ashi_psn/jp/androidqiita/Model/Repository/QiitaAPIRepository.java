package ashi_psn.jp.androidqiita.Model.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.Model.Repository.API.Request.QiitaAPI;
import ashi_psn.jp.androidqiita.Model.Repository.API.Request.RequestBody.Authorization;
import ashi_psn.jp.androidqiita.Model.Repository.API.Request.RequestBody.ItemQuery;
import ashi_psn.jp.androidqiita.Model.Repository.API.Response.Item;
import ashi_psn.jp.androidqiita.Model.Repository.API.Response.TokenResponse;
import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.View.Activity.BaseActivity;
import rx.Single;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class QiitaAPIRepository extends BaseRepository {


    private final BaseActivity activity;

    private final QiitaAPI api;

    @Inject
    public QiitaAPIRepository(BaseActivity activity, QiitaAPI api) {
        this.api = api;
        this.activity = activity;
    }


    public Single<TokenResponse> getAccessToken(String code) {
        Authorization body = Authorization.builder()
                .client_id(activity.getString(R.string.client_id))
                .client_secret(activity.getString(R.string.client_secret))
                .code(code)
                .build();
        Single<TokenResponse> response = api.getToken(body);
        return this.api.getToken(body);
    }

    public Single<List<Item>> getItems(ItemQuery query){
        return api.getItems(query);
    }

}
