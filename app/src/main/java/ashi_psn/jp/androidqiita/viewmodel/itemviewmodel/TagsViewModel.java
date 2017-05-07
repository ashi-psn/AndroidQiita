package ashi_psn.jp.androidqiita.viewmodel.itemviewmodel;

import android.view.View;

import java.util.List;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.repository.api.response.Tag;
import ashi_psn.jp.androidqiita.model.usecase.ItemUseCase;
import ashi_psn.jp.androidqiita.model.usecase.TagUseCase;
import rx.Observable;

/**
 * Created by ashi_psn on 2017/04/23.
 */

public class TagsViewModel {
    private final TagUseCase tagUseCase;
    Observable<Tag> tag;

    @Inject
    public TagsViewModel(TagUseCase tagUseCase){
        this.tagUseCase = tagUseCase;
    }

    public void onClickView(View v){

    }
}
