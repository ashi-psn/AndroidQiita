package ashi_psn.jp.androidqiita.viewmodel.itemviewmodel;

import java.util.List;

import ashi_psn.jp.androidqiita.model.repository.api.response.Tag;

/**
 * Created by ashi_psn on 2017/04/23.
 */

public class TagsViewModel {
    List<Tag> tags;

    public TagsViewModel(List<Tag> tags){
        this.tags = tags;
    }


}
