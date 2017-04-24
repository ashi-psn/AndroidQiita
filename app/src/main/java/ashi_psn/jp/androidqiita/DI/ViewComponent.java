package ashi_psn.jp.androidqiita.DI;

import android.view.View;

import dagger.Subcomponent;

/**
 * Created by ashi_psn on 2017/04/18.
 */


@Subcomponent(modules = {ViewModule.class})
public interface ViewComponent {
    void inject(View view);
//    void inject(DebugView view);
}
