package ashi_psn.jp.androidqiita.model.repository.dao.entity;

import io.realm.RealmObject;

/**
 * Created by ashi_psn on 2017/04/22.
 */


public class User extends RealmObject{

    private long id;
    private String client_id;
    private String token;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
