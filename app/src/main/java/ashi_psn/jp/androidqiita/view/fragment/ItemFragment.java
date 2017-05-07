package ashi_psn.jp.androidqiita.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.databinding.ActivityHomeBinding;
import ashi_psn.jp.androidqiita.databinding.FragmentItemBinding;
import ashi_psn.jp.androidqiita.view.adapter.ItemRecyclerViewAdapter;
import ashi_psn.jp.androidqiita.viewmodel.activityviewmodel.HomeActivityViewModel;
import ashi_psn.jp.androidqiita.viewmodel.fragmentviewmodel.ItemFragmentViewModel;

public class ItemFragment extends BaseFragment {

    @Inject
    ItemFragmentViewModel viewModel;

    private static final String DATASOURCEKEY = "DataSourceKey";
    private DataSource source;

    public enum DataSource{
        HOME,
        USER;

        String getDataSource(){
            return name();
        }
    }

    public ItemFragment() {
    }


    public static ItemFragment newInstance(DataSource param1) {
        ItemFragment fragment = new ItemFragment();
        Bundle args = new Bundle();
        args.putSerializable(DATASOURCEKEY, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            source = (DataSource) getArguments().getSerializable(DATASOURCEKEY);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getInjector().inject(this);
        bindViewModel(viewModel);
        FragmentItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_item, container, false);
        binding.setViewmodel(viewModel);

        // TODO viewmodelへデータソースを渡す
        binding.itemrecyclerview.setAdapter(new ItemRecyclerViewAdapter(viewModel.items));
        binding.itemrecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.itemrecyclerview.setHasFixedSize(true);
        return binding.getRoot();
    }
}
