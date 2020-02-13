package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by cdx on 2020/1/7.
 * desc:
 */
@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    /*
     * @author: cdx
     * @desc:
     * @param null
     * @return:
     * @TO DO:
     * @date: 2020/1/7 15:26
     * @throws:
     */
    private UserService service = new UserServiceImpl();

    /*
     * @author: cdx
     * @desc:用户注册
     * @param request
     * @param response
     * @return: void
     * @TO DO:
     * @date: 2020/1/7 15:12
     * @throws:
     */
    public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        Object checkCode = session.getAttribute("CHECKCODE_SERVER");


        Map<String, String[]> userMap = request.getParameterMap();

        String check = userMap.get("check")[0];
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        ResultInfo info = new ResultInfo();
        if (checkCode.toString().equalsIgnoreCase(check)) {
            User user = new User();
            try {
                BeanUtils.populate(user, userMap);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


            int i = service.registerUser(user);
            if (i > 0) {
                info.setFlag(true);

            } else if (i == 0) {
                info.setFlag(false);
                info.setErrorMsg("该用户名已存在");
            } else {
                info.setFlag(false);
                info.setErrorMsg("注册失败，请重新注册");
            }

        } else {
            info.setFlag(false);
            info.setErrorMsg("验证码错误");

        }
        session.invalidate();
        String json = mapper.writeValueAsString(info);
        //System.out.println(info);
        response.getWriter().write(json);
    }

    /*
     * @author: cdx
     * @desc:激活
     * @date: 2020/1/7 15:23
     * @throws:
     */
    public void active(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String code = request.getParameter("code");

        User user = service.findUserByCode(code);
        ObjectMapper mapper = new ObjectMapper();

        response.setContentType("text/html;charset=utf-8");
        String msg = "";
        if (user != null) {
            if (service.activeUser(user)) {

                msg = "激活成功，请<a href='login.jsp' >登录</a>";
            } else {

                msg = "激活失败，请联系管理员!";
            }

        } else {

            msg = "激活码错误";
        }
        response.getWriter().write(msg);
    }

    /*
     * @author: cdx
     * @desc:登录
     * @param request
     * @param response
     * @return: void
     * @TO DO:
     * @date: 2020/1/7 15:24
     * @throws:
     */
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        Object checkCode = session.getAttribute("CHECKCODE_SERVER");


        Map<String, String[]> userMap = request.getParameterMap();

        String check = userMap.get("check")[0];
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        ResultInfo info = new ResultInfo();
        if (checkCode.toString().equalsIgnoreCase(check)) {
            User loginUser = new User();
            try {
                BeanUtils.populate(loginUser, userMap);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


            User user = service.loginUser(loginUser);
            if (user != null) {
                if ("Y".equals(user.getStatus())) {
                    info.setFlag(true);
                    info.setData(user);
                    session.setAttribute("userInfo", user);
                } else {
                    info.setFlag(false);
                    info.setErrorMsg("登录失败，用户未激活，请激活后再登录");
                }

            } else {
                info.setFlag(false);
                info.setErrorMsg("登录失败，请重新登录");
                session.invalidate();
            }

        } else {
            info.setFlag(false);
            info.setErrorMsg("验证码错误");
        }
        session.removeAttribute("CHECKCODE_SERVER");
        String json = mapper.writeValueAsString(info);

        response.getWriter().write(json);
    }

    /*
     * @author: cdx
     * @desc: 退出登录
     * @param request
     * @param response
     * @return: void
     * @TO DO:
     * @date: 2020/1/7 15:24
     * @throws:
     */
    public void exit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect(request.getContextPath() + "/login.jsp");
    }

    /*
     * @author: cdx
     * @desc: 查找用户
     * @param request
     * @param response
     * @return: void
     * @TO DO:
     * @date: 2020/1/7 15:24
     * @throws:
     */
    public void findOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("userInfo");
        ResultInfo userInfo = new ResultInfo();
        if (user != null) {
            userInfo.setFlag(true);
            userInfo.setErrorMsg("欢迎回来：" + user.getName());
        } else {
            userInfo.setFlag(false);
            userInfo.setErrorMsg("未登录，请您登录");
        }
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getOutputStream(), userInfo);
    }


}
