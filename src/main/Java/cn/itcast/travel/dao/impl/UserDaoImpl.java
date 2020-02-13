package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by cdx on 2019/12/23.
 * desc:
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public int registerUser(User user) {
        String sql = "insert into tab_user(username,password,name,birthday,sex,telephone,email,status,code) values(?,?,?,?,?,?,?,?,?);";


        return template.update(sql, user.getUsername(), user.getPassword(), user.getName(), user.getBirthday(), user.getSex(), user.getTelephone(), user.getEmail(),user.getStatus(),user.getCode());

    }

    @Override
    public User loginUser(User user) {
        String sql = "select * from tab_user where username=? and password=?;";
        return template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), new Object[]{user.getUsername(), user.getPassword()});
    }

    @Override
    public int updateStatus(User user) {
        String sql = "update tab_user set status='Y' where uid=? ";
        return template.update(sql, user.getUid());
    }

    @Override
    public boolean findUserByUsername(User user) {
        String sql = "select count(uid) from tab_user where username=? ";
        Integer i = template.queryForObject(sql, Integer.class, user.getUsername());

        return i > 0;
    }

    @Override
    public User findUserByCode(String code) {
        String sql = "select uid from tab_user where code=?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), code);

    }


}
