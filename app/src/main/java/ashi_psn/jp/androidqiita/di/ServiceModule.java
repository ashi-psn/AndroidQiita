package ashi_psn.jp.androidqiita.di;

import android.app.Service;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Module
public class ServiceModule {
    private final Service service;
    public ServiceModule(Service service) {
        this.service = service;
    }

    @Provides
    public Service provideService() {
        return service;
    }
}
