package ashi_psn.jp.androidqiita.view.fragment;

import android.content.Context;
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
import ashi_psn.jp.androidqiita.databinding.FragmentItemBinding;
import ashi_psn.jp.androidqiita.view.adapter.ItemRecyclerViewAdapter;
import ashi_psn.jp.androidqiita.view.adapter.TagRecyclerViewAdapter;
import ashi_psn.jp.androidqiita.viewmodel.fragmentviewmodel.ItemFragmentViewModel;
import ashi_psn.jp.androidqiita.viewmodel.fragmentviewmodel.TagFragmentViewModel;
import ashi_psn.jp.androidqiita.databinding.FragmentTagBinding;

public class TagFragment extends BaseFragment {

    @Inject
    TagFragmentViewModel viewModel;

    public TagFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static TagFragment newInstance() {
        TagFragment fragment = new TagFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getInjector().inject(this);
        bindViewModel(viewModel);
        FragmentTagBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tag, container, false);
        binding.setViewmodel(viewModel);

        // TODO viewmodelへデータソースを渡す
        binding.itemrecyclerview.setAdapter(new TagRecyclerViewAdapter(viewModel.tags));
        binding.itemrecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.itemrecyclerview.setHasFixedSize(true);
        return binding.getRoot();
    }
}
