package ashi_psn.jp.androidqiita.di;

import ashi_psn.jp.androidqiita.view.activity.BaseActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Module
public class ActivityModule {
    private final BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    public BaseActivity provideActivity() {
        return activity;
    }

}
