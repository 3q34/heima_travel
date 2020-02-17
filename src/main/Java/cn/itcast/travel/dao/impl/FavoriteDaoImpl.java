package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.FavoriteDao;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;


/**
 * Created by cdx on 2020/2/13.
 * desc:
 */
public class FavoriteDaoImpl implements FavoriteDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public boolean isFavorite(int rid, int uid) {
        String sql = "select count(rid) from tab_favorite where rid=? and uid=?";
        Integer count = template.queryForObject(sql, Integer.class, rid, uid);
        return count > 0;
    }

    @Override
    public void add(int rid, int uid) {
        String sql = "insert into tab_favorite values(?,?,?)";
        Date date = new Date();
        template.update(sql, rid, date, uid);
    }
}
