package ashi_psn.jp.androidqiita.ViewModel.ItemViewModel;

import android.view.View;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.Model.Repository.API.Response.Item;

/**
 * Created by ashi_psn on 2017/04/23.
 */

public class ItemViewModel {
    Item item;

    @Inject
    public ItemViewModel(Item item){
        this.item = item;
    }

    public void onClickView(View v){

    }
}
