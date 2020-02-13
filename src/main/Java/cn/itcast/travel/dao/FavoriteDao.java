package cn.itcast.travel.dao;

/**
 * Created by cdx on 2020/2/13.
 * desc:
 */
public interface FavoriteDao {

    public boolean isFavorite(int rid, int uid);
    public void add(int rid, int uid);
}
