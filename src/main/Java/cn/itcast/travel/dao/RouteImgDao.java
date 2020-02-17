package cn.itcast.travel.dao;

import cn.itcast.travel.domain.RouteImg;

import java.util.List;

/**
 * Created by cdx on 2020/2/17.
 * desc:
 */
public interface RouteImgDao {
    List<RouteImg> getRouteImgsByRid(int rid);
}
