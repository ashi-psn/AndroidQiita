package ashi_psn.jp.androidqiita.Model.Repository.API.Request;

import java.util.List;
import java.util.Map;

import ashi_psn.jp.androidqiita.Model.Repository.API.Request.RequestBody.Authorization;
import ashi_psn.jp.androidqiita.Model.Repository.API.Response.Authenticateduser;
import ashi_psn.jp.androidqiita.Model.Repository.API.Response.Item;
import ashi_psn.jp.androidqiita.Model.Repository.API.Response.TokenResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Single;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public interface QiitaAPI{
    
    /**
     * トークンを受け取る
     * @param authorization 認証結果
     * @return アクセストークン
     */
    @Headers({ContentType.JSON})
    @POST("/api/v2/access_tokens")
    Single<TokenResponse> getToken(@Body Authorization authorization);


    /**
     * トークンを破棄する
     * @param token アクセストークン
     * @return
     */
    @Headers({ContentType.JSON})
    @DELETE("/api/v2/access_tokens/{token}")
    Single<TokenResponse> revokeToken(@Path("token")String token);


    /**
     * ログインユーザー情報取得
     * @param authorization
     * @return
     */
    @Headers({ContentType.JSON})
    @GET("/api/v2/authenticated_user")
    Single<Authenticateduser> getAuthUser(@Header("Authorization") String authorization);



    /**
     * 投稿一覧を取得
     * @param query (page,per_page,query)
     * @return
     */
    @Headers({ContentType.JSON})
    @GET("/api/v2/items")
    Single<List<Item>> getItems(@QueryMap Map<String, String> query);

    /**
     * 投稿を取得
     * @param id 投稿id
     * @return
     */
    @Headers({ContentType.JSON})
    @GET("/api/v2/items/{item_id}")
    Single<Item> getItem(@Path("item_id")String id);
}
