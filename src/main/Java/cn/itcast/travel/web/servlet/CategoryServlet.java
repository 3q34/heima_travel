package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.service.impl.CategoryServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2020/1/7.
 * desc:
 */
@WebServlet("/category/*")
public class CategoryServlet extends BaseServlet {
    private CategoryService service = new CategoryServiceImpl();

    public void findOneBycid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cid1 = request.getParameter("cid");
        int cid = 0;
        if (null != cid1 && cid1.length() > 0 && !"null".equals(cid1))
            cid = Integer.parseInt(cid1);
        String cname = service.getCname(cid);
        response.setContentType("application/json;charset=utf-8");
        //response.getWriter().write(cname);
        writeValue(response, cname);
    }

    /*
     * @author: cdx
     * @desc:分类菜单信息查询
     * @param request
     * @param response
     * @date: 2020/1/13 13:23
     */
    public void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String category = service.findAll();
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(category);
    }
}
