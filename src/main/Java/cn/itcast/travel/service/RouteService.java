package cn.itcast.travel.service;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;




/**
 * Created by cdx on 2020/1/14.
 * desc:
 */
public interface RouteService {
    PageBean<Route> getRouteByPage(int cid, String rname, int currentPage, int pageSize);


    Route getOneRouteByRid(int rid);


}
