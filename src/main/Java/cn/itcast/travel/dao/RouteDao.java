package cn.itcast.travel.dao;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.domain.Seller;

import java.util.List;

/**
 * Created by cdx on 2020/1/14.
 * desc:
 */
public interface RouteDao {
    PageBean<Route> getRouteByPage(int cid, String rname, int currentPage, int pageSize);

    List<RouteImg> getRouteImgsByRid(int rid);

    Route getOneRouteByRid(int rid);

    Seller getSeller(int sid);
}
