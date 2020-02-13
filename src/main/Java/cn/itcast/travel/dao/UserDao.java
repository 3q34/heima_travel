package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * Created by cdx on 2019/12/23.
 * desc:
 */
public interface UserDao {
    int registerUser(User user);

    User loginUser(User user);

    int updateStatus(User user);
    boolean findUserByUsername(User user);
    User findUserByCode(String code);
}
