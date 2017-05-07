package ashi_psn.jp.androidqiita.model.usecase;

/**
 * Created by ashi_psn on 2017/04/23.
 */

import java.util.List;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.QiitaAPIRepository;
import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.ItemQuery;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.repository.api.response.Tag;
import rx.Observable;


public class TagUseCase {

    private final QiitaAPIRepository apiRepository;

    @Inject
    public TagUseCase(QiitaAPIRepository apiRepository){
        this.apiRepository = apiRepository;
    }

    /**
     * タグ一覧を取得する
     * @param query
     * @return
     */
    public Observable<List<Tag>> getTags(){
        return apiRepository.getTags();
    }


}
