package ashi_psn.jp.androidqiita.model.repository.api.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class Group {
    /**
     * created_at : 2000-01-01T00:00:00+00:00
     * id : 1
     * name : Dev
     * private : false
     * updated_at : 2000-01-01T00:00:00+00:00
     * url_name : dev
     */

    private String created_at;
    private int id;
    private String name;
    @SerializedName("private")
    private boolean privateX;
    private String updated_at;
    private String url_name;

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPrivateX() {
        return privateX;
    }

    public void setPrivateX(boolean privateX) {
        this.privateX = privateX;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUrl_name() {
        return url_name;
    }

    public void setUrl_name(String url_name) {
        this.url_name = url_name;
    }
}
