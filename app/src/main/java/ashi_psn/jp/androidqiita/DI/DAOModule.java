package ashi_psn.jp.androidqiita.DI;

import android.content.Context;

import org.greenrobot.eventbus.EventBus;

import ashi_psn.jp.androidqiita.Model.Repository.DAO.UserDAO;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ashi_psn on 2017/04/23.
 */

@Module
public class DAOModule {
    private final UserDAO userDAO;


    public DAOModule(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Provides
    public UserDAO provideUserDAO(Context context){
        return userDAO;
    }
}
