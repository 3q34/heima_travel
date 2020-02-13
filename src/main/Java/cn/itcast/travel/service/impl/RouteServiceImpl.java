package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.dao.impl.RouteDaoImpl;
import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.Seller;
import cn.itcast.travel.service.RouteService;


/**
 * Created by cdx on 2020/1/14.
 * desc:
 */
public class RouteServiceImpl implements RouteService {
    private RouteDao dao = new RouteDaoImpl();

    @Override
    public PageBean<Route> getRouteByPage(int cid, String rname, int currentPage, int pageSize) {
        return dao.getRouteByPage(cid, rname, currentPage, pageSize);
    }

    @Override
    public Route getOneRouteByRid(int rid) {
        return dao.getOneRouteByRid(rid);
    }

    @Override
    public Seller getSeller(int sid) {
        return dao.getSeller(sid);
    }
}
