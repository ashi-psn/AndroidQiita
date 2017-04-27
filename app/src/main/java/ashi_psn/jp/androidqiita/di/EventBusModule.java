package ashi_psn.jp.androidqiita.di;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Module
public class EventBusModule {
    private final EventBus eventBus;

    public EventBusModule(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return eventBus;
    }
}
