package ashi_psn.jp.androidqiita.View.Activity;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import ashi_psn.jp.androidqiita.AndroidQiitaApplication;
import ashi_psn.jp.androidqiita.DI.ActivityComponent;
import ashi_psn.jp.androidqiita.DI.ActivityModule;
import ashi_psn.jp.androidqiita.ViewModel.ActivityViewModel.BaseActivityViewModel;

/**
 * Created by ashi_psn on 2017/04/17.
 */

public class BaseActivity extends RxAppCompatActivity {
    private BaseActivityViewModel viewModel;

    protected ActivityComponent getInjector() {
        AndroidQiitaApplication application = (AndroidQiitaApplication) getApplication();
        return application.getInjector().activityComponent(new ActivityModule(this));
    }

    /**
     * ビューモデルをこのアクティビティにバインドする
     * アクティビティのライフサイクルイベント発生時に、ビューモデルの対応するメソッドが呼ばれるようになります
     * @param viewModel
     */
    protected void bindViewModel(BaseActivityViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    protected void onStart() {
        super.onStart();
        checkViewModel();
        viewModel.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkViewModel();
        viewModel.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        checkViewModel();
        viewModel.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        checkViewModel();
        viewModel.onStop();
    }

    private void checkViewModel() {
        if (viewModel == null) {
            throw new IllegalStateException("Before resuming activity, bindViewModel must be called.");
        }
    }

}
