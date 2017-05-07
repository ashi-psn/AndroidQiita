package ashi_psn.jp.androidqiita.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.view.adapter.ItemRecyclerViewAdapter;
import ashi_psn.jp.androidqiita.view.adapter.ItemViewPagerAdapter;
import ashi_psn.jp.androidqiita.viewmodel.activityviewmodel.HomeActivityViewModel;
import ashi_psn.jp.androidqiita.databinding.ActivityHomeBinding;

public class HomeActivity extends BaseActivity{

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

        FragmentManager manager = getSupportFragmentManager();
        ViewPager viewPager = (ViewPager) findViewById(R.id.itemviewpager);
        ItemViewPagerAdapter adapter = new ItemViewPagerAdapter(manager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.main_tab);
        tabLayout.setupWithViewPager(viewPager);

//        binding.itemrecyclerview.setAdapter(new ItemRecyclerViewAdapter(viewModel.items));
//        binding.itemrecyclerview.setLayoutManager(new LinearLayoutManager(this));
//        binding.itemrecyclerview.setHasFixedSize(true);

//        binding.itemviewpager.setAdapter();
    }

}
