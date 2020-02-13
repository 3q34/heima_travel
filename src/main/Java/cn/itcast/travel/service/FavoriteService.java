package cn.itcast.travel.service;

/**
 * Created by cdx on 2020/2/12.
 * desc:
 */
public interface FavoriteService {
  boolean  isFavorite(int rid, int uid);
   void add(int rid,int  uid);
}
