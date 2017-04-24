package ashi_psn.jp.androidqiita.DI;

import ashi_psn.jp.androidqiita.View.Fragment.BaseFragment;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Module
public class FragmentModule {
    private final BaseFragment fragment;

    public FragmentModule(BaseFragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    public BaseFragment provideFragment() {
        return fragment;
    }

}
