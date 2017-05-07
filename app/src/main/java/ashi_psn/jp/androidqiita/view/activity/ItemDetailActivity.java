package ashi_psn.jp.androidqiita.view.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.databinding.ActivityItemDetailBinding;
import ashi_psn.jp.androidqiita.model.repository.api.response.Item;
import ashi_psn.jp.androidqiita.viewmodel.activityviewmodel.ItemDetailActivityViewModel;
import rx.Observable;

public class ItemDetailActivity extends BaseActivity {

    @Inject
    ItemDetailActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        getInjector().inject(this);
        bindViewModel(viewModel);

        Intent intent = getIntent();
        if(intent != null){
            Item item = (Item) intent.getSerializableExtra("item");
            viewModel.item = item;
        }

        ActivityItemDetailBinding binding =  DataBindingUtil.setContentView(this, R.layout.activity_item_detail);
        binding.setViewmodel(viewModel);
    }
}
