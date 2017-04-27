package ashi_psn.jp.androidqiita.viewmodel.itemviewmodel;

import android.view.View;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.model.usecase.ItemUseCase;
import rx.Observable;

/**
 * Created by ashi_psn on 2017/04/23.
 */

public class ItemViewModel {
    private final ItemUseCase itemUseCase;
    Observable<Item> items;

    @Inject
    public ItemViewModel(ItemUseCase itemUseCase){
        this.itemUseCase = itemUseCase;
    }

    public void onClickView(View v){

    }
}
