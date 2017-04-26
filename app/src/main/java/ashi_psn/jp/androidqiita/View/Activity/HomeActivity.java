package ashi_psn.jp.androidqiita.View.Activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.View.Adapter.ItemRecyclerViewAdapter;
import ashi_psn.jp.androidqiita.ViewModel.ActivityViewModel.HomeActivityViewModel;
import ashi_psn.jp.androidqiita.ViewModel.ActivityViewModel.LoginActivityViewModel;
import ashi_psn.jp.androidqiita.databinding.ActivityHomeBinding;
import ashi_psn.jp.androidqiita.databinding.ActivityLoginBinding;

public class HomeActivity extends  BaseActivity{

    @Inject
    HomeActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getInjector().inject(this);
        bindViewModel(viewModel);

        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.setViewmodel(viewModel);
        binding.itemrecyclerview.setAdapter(new ItemRecyclerViewAdapter(viewModel.items));
        binding.itemrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        binding.itemrecyclerview.setHasFixedSize(true);
    }

}
