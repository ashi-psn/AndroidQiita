package ashi_psn.jp.androidqiita.model.repository.api.response;

import android.databinding.BaseObservable;

import java.io.Serializable;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class Tag extends BaseObservable implements Serializable{


    /**
     * followers_count : 100
     * icon_url : https://s3-ap-northeast-1.amazonaws.com/qiita-tag-image/9de6a11d330f5694820082438f88ccf4a1b289b2/medium.jpg
     * id : qiita
     * items_count : 200
     */

    private int followers_count;
    private String icon_url;
    private String id;
    private int items_count;

    public int getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getItems_count() {
        return items_count;
    }

    public void setItems_count(int items_count) {
        this.items_count = items_count;
    }
}
