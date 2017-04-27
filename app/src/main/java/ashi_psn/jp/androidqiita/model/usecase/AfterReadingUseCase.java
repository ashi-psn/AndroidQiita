package ashi_psn.jp.androidqiita.model.usecase;

import javax.inject.Inject;

import ashi_psn.jp.androidqiita.model.repository.AfterReadingRepository;
import ashi_psn.jp.androidqiita.model.repository.dao.entity.AfterReading;
import io.realm.RealmResults;

/**
 * Created by ashi_psn on 2017/04/24.
 */

public class AfterReadingUseCase {

    AfterReadingRepository afterReadingRepository;

    @Inject
    public AfterReadingUseCase(AfterReadingRepository afterReadingRepository){
        this.afterReadingRepository = afterReadingRepository;
    }

    public AfterReading saveAfterReading(String idname){
        return afterReadingRepository.saveAfterReading(idname);
    }

    public RealmResults<AfterReading> getAll(){
        return afterReadingRepository.getAll();
    }
}
