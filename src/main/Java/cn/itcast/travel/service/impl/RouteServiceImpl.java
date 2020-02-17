package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.dao.RouteImgDao;
import cn.itcast.travel.dao.SellerDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.dao.impl.RouteDaoImpl;
import cn.itcast.travel.dao.impl.RouteImgDaoImpl;
import cn.itcast.travel.dao.impl.SellerDaoImpl;
import cn.itcast.travel.domain.*;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.service.RouteService;


/**
 * Created by cdx on 2020/1/14.
 * desc:
 */
public class RouteServiceImpl implements RouteService {
    private RouteDao routeDao = new RouteDaoImpl();
    private RouteImgDao routeImgDao = new RouteImgDaoImpl();
    private SellerDao sellerDao = new SellerDaoImpl();
    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    public PageBean<Route> getRouteByPage(int cid, String rname, int currentPage, int pageSize) {
        return routeDao.getRouteByPage(cid, rname, currentPage, pageSize);
    }

    @Override
    public Route getOneRouteByRid(int rid) {
        Route route = routeDao.getOneRouteByRid(rid);
        route.setRouteImgList(routeImgDao.getRouteImgsByRid(route.getRid()));
        route.setSeller(sellerDao.getSeller(route.getSid()));

        String cname = categoryDao.getCname(route.getCid());
        Category category = new Category(route.getCid(), cname);
        route.setCategory(category);
        return route;
    }


}
