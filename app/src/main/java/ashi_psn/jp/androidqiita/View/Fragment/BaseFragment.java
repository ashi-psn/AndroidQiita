package ashi_psn.jp.androidqiita.View.Fragment;

import com.trello.rxlifecycle.components.support.RxFragment;

import ashi_psn.jp.androidqiita.AndroidQiitaApplication;
import ashi_psn.jp.androidqiita.DI.FragmentComponent;
import ashi_psn.jp.androidqiita.DI.FragmentModule;
import ashi_psn.jp.androidqiita.ViewModel.FragmentViewModel.BaseFragmentViewModel;


/**
 * Created by ashi_psn on 2017/04/18.
 */

public class BaseFragment extends RxFragment {
    private BaseFragmentViewModel viewModel;

    /**
     * DI
     * @return
     */
    protected FragmentComponent getInjector() {
        AndroidQiitaApplication application = (AndroidQiitaApplication) getContext().getApplicationContext();
        return application.getInjector().fragmentComponent(new FragmentModule(this));
    }

    /**
     * ビューモデルをこのフラグメントにバインドする
     * フラグメントのライフサイクルイベント発生時に、ビューモデルの対応するメソッドが呼ばれるようになります
     * @param viewModel
     */
    protected void bindViewModel(BaseFragmentViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void onStart() {
        super.onStart();
        checkViewModel();
        viewModel.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        checkViewModel();
        viewModel.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        checkViewModel();
        viewModel.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        checkViewModel();
        viewModel.onStop();
    }

    private void checkViewModel() {
        if (viewModel == null) {
            throw new IllegalStateException("Before resuming fragment, bindViewModel must be called.");
        }
    }

}
