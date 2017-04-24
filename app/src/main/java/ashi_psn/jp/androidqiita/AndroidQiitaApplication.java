package ashi_psn.jp.androidqiita;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

import ashi_psn.jp.androidqiita.DI.AppComponent;
import ashi_psn.jp.androidqiita.DI.AppModule;
import ashi_psn.jp.androidqiita.DI.DaggerAppComponent;
import ashi_psn.jp.androidqiita.DI.EventBusModule;

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
