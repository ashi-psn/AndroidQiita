package ashi_psn.jp.androidqiita.model.repository.api.response;

import java.io.Serializable;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class User implements Serializable{

    /**
     * description : Hello, world.
     * facebook_id : yaotti
     * followees_count : 100
     * followers_count : 200
     * github_login_name : yaotti
     * id : yaotti
     * items_count : 300
     * linkedin_id : yaotti
     * location : Tokyo, Japan
     * name : Hiroshige Umino
     * organization : Increments Inc
     * permanent_id : 1
     * profile_image_url : https://si0.twimg.com/profile_images/2309761038/1ijg13pfs0dg84sk2y0h_normal.jpeg
     * twitter_screen_name : yaotti
     * website_url : http://yaotti.hatenablog.com
     */

    private String description;
    private String facebook_id;
    private int followees_count;
    private int followers_count;
    private String github_login_name;
    private String id;
    private int items_count;
    private String linkedin_id;
    private String location;
    private String name;
    private String organization;
    private int permanent_id;
    private String profile_image_url;
    private String twitter_screen_name;
    private String website_url;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFacebook_id() {
        return facebook_id;
    }

    public void setFacebook_id(String facebook_id) {
        this.facebook_id = facebook_id;
    }

    public int getFollowees_count() {
        return followees_count;
    }

    public void setFollowees_count(int followees_count) {
        this.followees_count = followees_count;
    }

    public int getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public String getGithub_login_name() {
        return github_login_name;
    }

    public void setGithub_login_name(String github_login_name) {
        this.github_login_name = github_login_name;
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

    public String getLinkedin_id() {
        return linkedin_id;
    }

    public void setLinkedin_id(String linkedin_id) {
        this.linkedin_id = linkedin_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getPermanent_id() {
        return permanent_id;
    }

    public void setPermanent_id(int permanent_id) {
        this.permanent_id = permanent_id;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getTwitter_screen_name() {
        return twitter_screen_name;
    }

    public void setTwitter_screen_name(String twitter_screen_name) {
        this.twitter_screen_name = twitter_screen_name;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }
}
