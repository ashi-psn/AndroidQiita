package ashi_psn.jp.androidqiita.di;

import ashi_psn.jp.androidqiita.view.activity.HomeActivity;
import ashi_psn.jp.androidqiita.view.activity.LoginActivity;
import ashi_psn.jp.androidqiita.viewmodel.activityviewmodel.HomeActivityViewModel;
import ashi_psn.jp.androidqiita.viewmodel.activityviewmodel.LoginActivityViewModel;
import dagger.Subcomponent;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(LoginActivity activity);
    void inject(HomeActivity activity);
    LoginActivityViewModel loginviewModel();
    HomeActivityViewModel homeviewModel();
}
