package ashi_psn.jp.androidqiita.di;

import ashi_psn.jp.androidqiita.view.fragment.ItemFragment;
import ashi_psn.jp.androidqiita.view.fragment.TagFragment;
import ashi_psn.jp.androidqiita.viewmodel.fragmentviewmodel.ItemFragmentViewModel;
import ashi_psn.jp.androidqiita.viewmodel.fragmentviewmodel.TagFragmentViewModel;
import dagger.Subcomponent;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Subcomponent(modules = {FragmentModule.class})
public interface FragmentComponent {
    void inject(ItemFragment fragment);
    void inject(TagFragment fragment);
    ItemFragmentViewModel itemfragmentviewmodel();
    TagFragmentViewModel tagfragmentviewmodel();
}
