package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.FavoriteDao;
import cn.itcast.travel.dao.impl.FavoriteDaoImpl;
import cn.itcast.travel.service.FavoriteService;

/**
 * Created by cdx on 2020/2/12.
 * desc:
 */
public class FavoriteServiceImpl implements FavoriteService {
    private FavoriteDao dao = new FavoriteDaoImpl();

    @Override
    public boolean isFavorite(int rid, int uid) {
        return dao.isFavorite(rid, uid);
    }

    @Override
    public void add(int rid, int uid) {
        dao.add(rid, uid);
    }
}
