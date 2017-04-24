package ashi_psn.jp.androidqiita.View.Activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;



import javax.inject.Inject;

import ashi_psn.jp.androidqiita.R;
import ashi_psn.jp.androidqiita.ViewModel.ActivityViewModel.LoginActivityViewModel;
import ashi_psn.jp.androidqiita.databinding.ActivityLoginBinding;


public class LoginActivity extends BaseActivity {

    @Inject
    LoginActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getInjector().inject(this);
        bindViewModel(viewModel);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setViewmodel(viewModel);

        Intent intent = getIntent();
        if((intent != null) && (intent.getData() != null)){
            String code = intent.getData().getQueryParameter("code");
            Log.d("","");
            viewModel.authenticationCallback(intent.getData().getQueryParameter("code"));
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
