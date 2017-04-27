package ashi_psn.jp.androidqiita.model.usecase;

/**
 * Created by ashi_psn on 2017/04/23.
 */

import java.util.List;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.ItemQuery;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.repository.QiitaAPIRepository;
import rx.Observable;

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
