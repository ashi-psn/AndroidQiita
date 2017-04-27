package ashi_psn.jp.androidqiita.model.repository.dao;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.dao.entity.AfterReading;
import io.realm.Realm;

/**
 * Created by ashi_psn on 2017/04/24.
 */


public class AfterReadingDAO extends BaseDAO<AfterReading>{

    @Inject
    public AfterReadingDAO(Realm realm){
        super(realm);
    }

    public AfterReading saveAfterReading(String itemid){
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        AfterReading afterReading = realm.createObject(AfterReading.class,getNextUserId());
        afterReading.setItemid(itemid);
        realm.commitTransaction();
        return afterReading;
    }
}
