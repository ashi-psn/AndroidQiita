package ashi_psn.jp.androidqiita.model.repository;

import java.util.List;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.request.QiitaAPI;
import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.Authorization;
import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.ItemQuery;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.repository.api.response.TokenResponse;
import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.view.activity.BaseActivity;
import rx.Observable;
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

    public Observable<List<Item>> getItems(ItemQuery query){
        return api.getItems(query);
    }

}
