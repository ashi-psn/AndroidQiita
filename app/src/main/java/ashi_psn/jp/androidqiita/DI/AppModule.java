package ashi_psn.jp.androidqiita.DI;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import javax.inject.Singleton;

import ashi_psn.jp.androidqiita.Model.Repository.API.Request.QiitaAPI;
import ashi_psn.jp.androidqiita.Model.Repository.DAO.Entity.AfterReading;
import ashi_psn.jp.androidqiita.R;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ashi_psn on 2017/04/18.
 */

@Module
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public Context provideApplicationContext() {
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    public OkHttpClient provideOkHttp() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        return new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .addInterceptor(logging)
                .build();
    }


    @Singleton
    @Provides
    public QiitaAPI provideAuthAPI(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(application.getApplicationContext().getString(R.string.baseurl))
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        return retrofit.create(QiitaAPI.class);
    }

    @Singleton
    @Provides
    public Realm provideRealm(){
        Realm.init(provideApplicationContext());
        RealmConfiguration realmConfig = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfig);
        return Realm.getDefaultInstance();
    }

    @Singleton
    @Provides
    public Class<AfterReading> provideAfterReading(){
        return AfterReading.class;
    }

}
