package ashi_psn.jp.androidqiita.model.repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashi_psn on 2017/04/21.
 */

public abstract class BaseRepository<K, V> {

    private Map<K, V> cache;

    public BaseRepository() {
        this.cache = new HashMap<>();
    }

    protected Map<K, V> getCache() {
        return cache;
    }

    /**
     * リポジトリのキャッシュをクリアする
     * TODO ユースケースがこのメソッドを叩くのは設計的に微妙かも
     */
    public void clearCache() {
        cache.clear();
    }

}
