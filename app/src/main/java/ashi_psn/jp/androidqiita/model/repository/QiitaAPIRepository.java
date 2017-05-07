package ashi_psn.jp.androidqiita.model.repository;

import android.app.Activity;
import android.content.Context;

import java.util.List;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.request.QiitaAPI;
import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.Authorization;
import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.ItemQuery;
import ashi_psn.jp.androidqiita.model.repository.api.response.Comment;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.repository.api.response.Tag;
import ashi_psn.jp.androidqiita.model.repository.api.response.TokenResponse;
import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.view.activity.BaseActivity;
import rx.Observable;
import rx.Single;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class QiitaAPIRepository extends BaseRepository {

    private final Context context;
    private final QiitaAPI api;

    @Inject
    public QiitaAPIRepository(Context context, QiitaAPI api) {
        this.api = api;
        this.context = context;
    }


    /**
     * リクエストコードを元にアクセストークンを取得する
     * @param code
     * @return
     */
    public Single<TokenResponse> getAccessToken(String code) {
        Authorization body = Authorization.builder()
                .client_id(context.getString(R.string.client_id))
                .client_secret(context.getString(R.string.client_secret))
                .code(code)
                .build();
        Single<TokenResponse> response = api.getToken(body);
        return this.api.getToken(body);
    }

    /**
     * 検索クエリーを元にアイテム一覧を取得する
     * @param query
     * @return アイテム一覧
     */
    public Observable<List<Item>> getItems(ItemQuery query){
        return api.getItems(query);
    }

    /**
     * タグ一覧を取得する
     * @return タグ一覧
     */
    public Observable<List<Tag>>getTags(){
        return api.getTags();
    }

    /**
     * アイテムidを元にコメント一覧を取得する
     * @param itemid
     * @return コメント一覧
     */
    public Observable<List<Comment>>getComments(String itemid){
        return api.getComments(itemid);
    }
}
