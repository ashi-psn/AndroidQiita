package ashi_psn.jp.androidqiita.Model.Usecase;

/**
 * Created by ashi_psn on 2017/04/23.
 */

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.Model.Repository.API.Request.QiitaAPI;
import ashi_psn.jp.androidqiita.Model.Repository.API.Request.RequestBody.ItemQuery;
import ashi_psn.jp.androidqiita.Model.Repository.API.Response.Item;
import ashi_psn.jp.androidqiita.Model.Repository.QiitaAPIRepository;
import rx.Observable;
import rx.Single;

/**
 * 記事の取得・投稿ユースケース
 */
public class ItemUseCase {

    private final QiitaAPIRepository apiRepository;

    @Inject
    public ItemUseCase(QiitaAPIRepository apiRepository){
        this.apiRepository = apiRepository;
    }

    /**
     * 投稿を検索
     * @param query
     * @return
     */
    public Observable<List<Item>> getItems(ItemQuery query){
        return apiRepository.getItems(query);
    }


}
