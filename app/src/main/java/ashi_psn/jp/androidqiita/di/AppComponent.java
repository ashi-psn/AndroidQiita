package ashi_psn.jp.androidqiita.di;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Singleton
@Component(modules = {AppModule.class, EventBusModule.class})
public interface AppComponent {
    ActivityComponent activityComponent(ActivityModule activityModule);
    FragmentComponent fragmentComponent(FragmentModule fragmentModule);
    ServiceComponent serviceComponent(ServiceModule serviceModule);
    ViewComponent viewComponent(ViewModule viewModule);
//    RealmObjectClassModule realmObjectClassModule(Class<AfterReading> afterReading);
}
