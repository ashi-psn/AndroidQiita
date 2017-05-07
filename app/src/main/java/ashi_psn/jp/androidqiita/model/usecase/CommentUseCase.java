package ashi_psn.jp.androidqiita.model.usecase;

/**
 * Created by ashi_psn on 2017/04/23.
 */

import java.util.List;
import java.util.StringJoiner;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.QiitaAPIRepository;
import ashi_psn.jp.androidqiita.model.repository.api.request.requestbody.ItemQuery;
import ashi_psn.jp.androidqiita.model.repository.api.response.Comment;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import rx.Observable;

/**
 * コメントの取得・投稿ユースケース
 */
public class CommentUseCase {

    private final QiitaAPIRepository apiRepository;

    @Inject
    public CommentUseCase(QiitaAPIRepository apiRepository){
        this.apiRepository = apiRepository;
    }

    /**
     * 投稿のidからコメント一覧を取得
     * @param query
     * @return
     */
    public Observable<List<Comment>> getComments(String itemid){
        return apiRepository.getComments(itemid);
    }
}
