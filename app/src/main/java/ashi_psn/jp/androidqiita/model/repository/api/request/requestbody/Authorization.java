package ashi_psn.jp.androidqiita.model.repository.api.request.requestbody;

import lombok.NonNull;
import lombok.experimental.Builder;

/**
 * Created by ashi_psn on 2017/04/21.
 */

@Builder
public class Authorization {

    /**
     * client_id : d6d473265c940e355b3dd497eb1bd95d34cb3175
     * client_secret : c7a0c6cdef364ec94e94f2bce0756f9561b6b574
     * code : dd44b8139a60eb0dc25cb38094852e868b3098b0
     */

    @NonNull
    private String client_id;

    @NonNull
    private String client_secret;

    @NonNull
    private String code;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
