package ashi_psn.jp.androidqiita.model.repository.api.response;

import java.util.List;

/**
 * Created by ashi_psn on 2017/04/21.
 */

public class TokenResponse{


    /**
     * client_id : d6d473265c940e355b3dd497eb1bd95d34cb3175
     * scopes : ["read_qiita","write_qiita"]
     * token : 20fd609190347369df2967f8bee754cbe1e7eb2a
     */

    private String client_id;
    private String token;
    private List<String> scopes;

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

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
}
