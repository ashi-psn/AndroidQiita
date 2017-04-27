package ashi_psn.jp.androidqiita;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

import ashi_psn.jp.androidqiita.di.AppComponent;
import ashi_psn.jp.androidqiita.di.AppModule;
import ashi_psn.jp.androidqiita.di.DaggerAppComponent;
import ashi_psn.jp.androidqiita.di.EventBusModule;

/**
 * Created by ashi_psn on 2017/04/18.
 */

public class AndroidQiitaApplication extends Application {
    private AppComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector = buildAppComponent();
    }

    protected AppComponent buildAppComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .eventBusModule(new EventBusModule(EventBus.getDefault()))
                .build();
    }



    public AppComponent getInjector() {
        return injector;
    }

}
