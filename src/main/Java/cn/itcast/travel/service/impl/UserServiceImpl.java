package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

/**
 * Created by cdx on 2019/12/23.
 * desc:
 */
public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public int registerUser(User user) {
        boolean exist = dao.findUserByUsername(user);
        if (exist) {
            return 0;
        } else {
            user.setCode(UuidUtil.getUuid());
            user.setStatus("N");
            int i = dao.registerUser(user);
            String content = "<a href='http://localhost:8080/travel/user/active?code=" + user.getCode() + "'>点击激活【黑马旅游网】</a>";
            MailUtils.sendMail(user.getEmail(), content, "黑马旅游网激活邮件");

            return i;
        }
    }

    @Override
    public User loginUser(User user) {
        return dao.loginUser(user);
    }

    @Override
    public User findUserByCode(String code) {
        return dao.findUserByCode(code);
    }

    @Override
    public boolean activeUser(User user) {
        int i = dao.updateStatus(user);
        return i > 0;
    }
}
