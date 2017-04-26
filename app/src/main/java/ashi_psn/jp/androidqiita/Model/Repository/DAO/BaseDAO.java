package ashi_psn.jp.androidqiita.Model.Repository.DAO;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import ashi_psn.jp.androidqiita.Model.Repository.DAO.Entity.AfterReading;
import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by ashi_psn on 2017/04/24.
 */

@Singleton
public abstract class BaseDAO<T extends RealmObject> {

    private final Realm realm;
    public T t;

    public BaseDAO(Realm realm/*,T t*/){
        this.realm = realm;
//        this.t = t;
    }

    public T selectFirst(){
        return findAll().first();
    }

    public T selectLast(){
        return findAll().last();
    }

    public RealmResults<T> findAll(){
        return (RealmResults<T>) realm.where(this.t.getClass()).findAll();
    }


    public void deleteAll(){
        realm.beginTransaction();
        realm.delete(t.getClass());
        realm.commitTransaction();
    }

    public Integer getNextUserId() {
        Integer nextUserId = 1;
        Number maxUserId = realm.where(t.getClass()).max("id");
        if(maxUserId != null) {
            nextUserId = maxUserId.intValue() + 1;
        }
        return nextUserId;
    }
}
