package ashi_psn.jp.androidqiita.model.repository.dao.entity;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by ashi_psn on 2017/04/24.
 */


public class AfterReading extends RealmObject {
    @PrimaryKey
    private Integer id;
    private String itemid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }
}
