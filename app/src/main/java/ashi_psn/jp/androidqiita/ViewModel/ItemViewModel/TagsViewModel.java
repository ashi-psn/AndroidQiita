package ashi_psn.jp.androidqiita.ViewModel.ItemViewModel;

import java.util.List;

import ashi_psn.jp.androidqiita.Model.Repository.API.Response.Tag;

/**
 * Created by ashi_psn on 2017/04/23.
 */

public class TagsViewModel {
    List<Tag> tags;

    public TagsViewModel(List<Tag> tags){
        this.tags = tags;
    }


}
