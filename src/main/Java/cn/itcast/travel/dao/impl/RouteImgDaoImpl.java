package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteImgDao;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by cdx on 2020/2/17.
 * desc:
 */
public class RouteImgDaoImpl implements RouteImgDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<RouteImg> getRouteImgsByRid(int rid) {
        String sql = "select * from tab_route_img where rid=?";
        List<RouteImg> routeImgs = template.query(sql, new BeanPropertyRowMapper<>(RouteImg.class), rid);
        return routeImgs;
    }
}
