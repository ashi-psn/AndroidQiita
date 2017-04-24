package ashi_psn.jp.androidqiita.Model.Repository.API.Request.RequestBody;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import ashi_psn.jp.androidqiita.Model.Repository.API.Response.Item;

/**
 * Created by ashi_psn on 2017/04/23.
 */

public class ItemQuery extends HashMap<String,String>{

    public ItemQuery(){

    }

    public static class Builder {
        HashMap<String,String> query;
        public  Builder(){
            query = new ItemQuery();
        }

        public Builder setPage(String page){
            query.put("page",page);
            return this;
        }

        public Builder setPerPage(String perPage){
            query.put("per_page",perPage);
            return this;
        }

        public Builder setQuery(String query){
            this.query.put("query",query);
            return this;
        }

        public HashMap<String, String> build(){
            return query;
        }
    }
}
