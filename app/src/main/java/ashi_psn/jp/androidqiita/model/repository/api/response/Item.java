package ashi_psn.jp.androidqiita.model.repository.api.response;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ashi_psn.jp.androidqiita.BR;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class Item extends BaseObservable{

    /**
     * rendered_body : <h1>Example</h1>
     * body : # Example
     * coediting : false
     * created_at : 2000-01-01T00:00:00+00:00
     * group : {"created_at":"2000-01-01T00:00:00+00:00","id":1,"name":"Dev","private":false,"updated_at":"2000-01-01T00:00:00+00:00","url_name":"dev"}
     * id : 4bd431809afb1bb99e4f
     * private : false
     * tags : [{"name":"Ruby","versions":["0.0.1"]}]
     * title : Example title
     * updated_at : 2000-01-01T00:00:00+00:00
     * url : https://qiita.com/yaotti/items/4bd431809afb1bb99e4f
     * user : {"description":"Hello, world.","facebook_id":"yaotti","followees_count":100,"followers_count":200,"github_login_name":"yaotti","id":"yaotti","items_count":300,"linkedin_id":"yaotti","location":"Tokyo, Japan","name":"Hiroshige Umino","organization":"Increments Inc","permanent_id":1,"profile_image_url":"https://si0.twimg.com/profile_images/2309761038/1ijg13pfs0dg84sk2y0h_normal.jpeg","twitter_screen_name":"yaotti","website_url":"http://yaotti.hatenablog.com"}
     */

    private String rendered_body;
    private String body;
    private boolean coediting;
    private String created_at;
    private Group group;
    private String id;
    @SerializedName("private")
    private boolean privateX;
    private String title;
    private String updated_at;
    private String url;
    private User user;
    private List<TagsBean> tags;
    private List<Tag> v2tags;


    public String getRendered_body() {
        return rendered_body;
    }

    public void setRendered_body(String rendered_body) {
        this.rendered_body = rendered_body;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isCoediting() {
        return coediting;
    }

    public void setCoediting(boolean coediting) {
        this.coediting = coediting;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPrivateX() {
        return privateX;
    }

    public void setPrivateX(boolean privateX) {
        this.privateX = privateX;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Bindable
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        notifyPropertyChanged(BR.user);
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }


    public static class TagsBean {
        /**
         * name : bug
         * versions : []
         */

        private String name;
        private List<?> versions;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<?> getVersions() {
            return versions;
        }

        public void setVersions(List<?> versions) {
            this.versions = versions;
        }
    }

    private void setV2Tags(List<Tag> tags){
        this.v2tags = tags;
    }

    private List<Tag> getV2tags(){
        return v2tags;
    }
}
