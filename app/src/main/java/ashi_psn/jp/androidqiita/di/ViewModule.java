package ashi_psn.jp.androidqiita.di;

import android.view.View;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Module
public class ViewModule {
    private final View view;

    public ViewModule(View view) {
        this.view = view;
    }

    @Provides
    public View provideView() {
        return view;
    }
}
