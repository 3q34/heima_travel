package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.*;
import cn.itcast.travel.service.FavoriteService;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.FavoriteServiceImpl;
import cn.itcast.travel.service.impl.RouteServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * Created by cdx on 2020/1/14.
 * desc:
 */
@WebServlet("/route/*")
public class RouteServlet extends BaseServlet {
    private RouteService service = new RouteServiceImpl();
    private FavoriteService favoriteService = new FavoriteServiceImpl();

    /*
     * @author: cdx
     * @desc:根据cid,currentpage,pageSize,rname等分页查询线路
     * @param request
     * @param response
     * @return: void
     * @TO DO:
     * @date: 2020/2/11 13:04
     * @throws:
     */
    public void getRouteByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String cid1 = request.getParameter("cid");
        String currentPage1 = request.getParameter("currentPage");
        String pageSize1 = request.getParameter("pageSize");
        String rname = request.getParameter("rname");
        if (rname != null && rname != "")
            rname = URLDecoder.decode(rname, "utf-8");
        int currentPage = 1;
        int pageSize = 10;
        int cid = 0;
        if (null != cid1 && cid1.length() > 0 && !"null".equals(cid1))
            cid = Integer.parseInt(cid1);
        if (null != currentPage1 && currentPage1.length() > 0 && !"".equals(currentPage1)) {

            currentPage = Integer.parseInt(currentPage1);
            pageSize = Integer.parseInt(pageSize1);
        }
        PageBean<Route> route = service.getRouteByPage(cid, rname, currentPage, pageSize);
        writeValue(response, route);
        //System.out.println(route);
    }

    /*
     * @author: cdx
     * @desc:根据rid查询线路详情
     * @param request
     * @param response
     * @return: void
     * @TO DO:
     * @date: 2020/2/11 13:05
     * @throws:
     */
    public void getOneRouteByRid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String rid1 = request.getParameter("rid");
        int rid = 0;
        if (null != rid1 && rid1.length() > 0 && !"null".equals(rid1))
            rid = Integer.parseInt(rid1);
        Route route = service.getOneRouteByRid(rid);
        //route.setRouteImgList(service.getRouteImgsByRid(rid));
        writeValue(response, route);

    }

    /**
     * 判断当前登录用户是否收藏过该线路
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void isFavorite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取线路id
        String rid1 = request.getParameter("rid");
        int rid = 0;
        if (null != rid1 && rid1.length() > 0 && !"null".equals(rid1))
            rid = Integer.parseInt(rid1);
        //2. 获取当前登录的用户 user
        User user = (User) request.getSession().getAttribute("user");
        int uid;//用户id
        if (user == null) {
            //用户尚未登录
            uid = 0;
        } else {
            //用户已经登录
            uid = user.getUid();
        }

        //3. 调用FavoriteService查询是否收藏
        boolean flag = favoriteService.isFavorite(rid, uid);

        //4. 写回客户端
        writeValue(response, flag);
    }

    /**
     * 添加收藏
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void addFavorite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取线路rid
        String rid1 = request.getParameter("rid");
        int rid = 0;
        if (null != rid1 && rid1.length() > 0 && !"null".equals(rid1))
            rid = Integer.parseInt(rid1);
        //2. 获取当前登录的用户
        User user = (User) request.getSession().getAttribute("user");
        int uid;//用户id
        if (user == null) {
            //用户尚未登录
            return;
        } else {
            //用户已经登录
            uid = user.getUid();
        }


        //3. 调用service添加
        favoriteService.add(rid, uid);

    }

    public void getSeller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取线路rid
        String sid1 = request.getParameter("sid");
        int sid = 0;
        if (null != sid1 && sid1.length() > 0 && !"null".equals(sid1))
            sid = Integer.parseInt(sid1);
        Seller sellor = service.getSeller(sid);
        writeValue(response, sellor);

    }

}
