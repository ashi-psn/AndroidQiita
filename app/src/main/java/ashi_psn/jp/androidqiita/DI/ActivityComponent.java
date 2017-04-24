package ashi_psn.jp.androidqiita.DI;

import ashi_psn.jp.androidqiita.View.Activity.HomeActivity;
import ashi_psn.jp.androidqiita.View.Activity.LoginActivity;
import ashi_psn.jp.androidqiita.ViewModel.ActivityViewModel.HomeActivityViewModel;
import ashi_psn.jp.androidqiita.ViewModel.ActivityViewModel.LoginActivityViewModel;
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
