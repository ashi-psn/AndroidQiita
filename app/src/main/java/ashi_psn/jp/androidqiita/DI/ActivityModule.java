package ashi_psn.jp.androidqiita.DI;

import ashi_psn.jp.androidqiita.View.Activity.BaseActivity;
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
