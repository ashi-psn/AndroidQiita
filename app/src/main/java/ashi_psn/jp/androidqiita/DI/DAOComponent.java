package ashi_psn.jp.androidqiita.DI;

import javax.inject.Singleton;

import ashi_psn.jp.androidqiita.Model.Repository.DAO.UserDAO;
import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by ashi_psn on 2017/04/23.
 */

@Subcomponent(modules = {DAOModule.class})
public interface DAOComponent {
    UserDAO userDAO();
}
