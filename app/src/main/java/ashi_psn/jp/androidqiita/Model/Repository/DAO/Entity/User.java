package ashi_psn.jp.androidqiita.Model.Repository.DAO.Entity;

import java.util.List;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import lombok.NonNull;
import lombok.experimental.Builder;
import rx.Observable;

/**
 * Created by ashi_psn on 2017/04/22.
 */

//@Builder
public class User extends RealmObject{
    @PrimaryKey
    private long id;
    private String client_id;
    private String token;

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
