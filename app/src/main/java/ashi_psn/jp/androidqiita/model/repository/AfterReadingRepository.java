package ashi_psn.jp.androidqiita.model.repository;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.dao.AfterReadingDAO;
import ashi_psn.jp.androidqiita.model.repository.dao.entity.AfterReading;
import io.realm.RealmResults;

/**
 * Created by ashi_psn on 2017/04/24.
 */

public class AfterReadingRepository extends BaseRepository {

    private final AfterReadingDAO afterReadingDAO;

    @Inject
    public AfterReadingRepository(AfterReadingDAO afterReadingDAO){
        this.afterReadingDAO = afterReadingDAO;
    }

    public AfterReading saveAfterReading(String idname){
        return afterReadingDAO.saveAfterReading(idname);
    }

    public RealmResults<AfterReading> getAll(){
        return afterReadingDAO.findAll();
    }
}
