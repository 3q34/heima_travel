package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * Created by cdx on 2019/12/23.
 * desc:
 */
public interface UserService {
    int registerUser(User user);

    User loginUser(User user);

    User findUserByCode(String code);
    boolean activeUser(User user);
}
