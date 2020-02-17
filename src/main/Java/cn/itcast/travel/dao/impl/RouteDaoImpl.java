package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.domain.Seller;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cdx on 2020/1/14.
 * desc:
 */
public class RouteDaoImpl implements RouteDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public PageBean<Route> getRouteByPage(int cid, String rname, int currentPage, int pageSize) {
        PageBean<Route> pageBean = new PageBean<>();
        String sqlCount = "select count(rid) from tab_route where 1=1 ";
        String sql = "select * from tab_route where 1=1 ";
        //List<Object> params = new ArrayList<>();//可以存储任意多的对象，但是只能存储对象，不能存储原生数据类型例如int。
        List params = new ArrayList();
        if (cid != 0) {
            sqlCount += "  and cid= ?";
            sql += "  and cid= ?";
            params.add(cid);
        }
        if (rname != null && rname != "") {
            sqlCount += "  and rname like ?";
            sql += "  and rname like ?";
            params.add("%" + rname + "%");
        }
        Integer totalCount = template.queryForObject(sqlCount, Integer.class, params.toArray());
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        pageBean.setTotalCount(totalCount);
        pageBean.setCurrentPage(currentPage);
        pageBean.setPageSize(pageSize);
        pageBean.setTotalPage(totalPage);
        int start = (currentPage - 1) * pageSize;

        params.add(start);
        params.add(pageSize);
        sql += " limit ?,?";
        List<Route> list = template.query(sql, new BeanPropertyRowMapper<>(Route.class), params.toArray());
        pageBean.setList(list);
        return pageBean;
    }



    @Override
    public Route getOneRouteByRid(int rid) {
        String sql = "select * from tab_route where rid=?";
        Route route = template.queryForObject(sql, new BeanPropertyRowMapper<>(Route.class), rid);
//        route.setRouteImgList(getRouteImgsByRid(rid));//图片list
//        route.setSeller(getSeller(route.getSid()));//seller对象
        return route;
    }


}
