package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


/**
 * Created by cdx on 2020/1/13.
 * desc:
 */
public class CategoryDaoImpl implements CategoryDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Category> findAll() {
        String sql = "select * from tab_category order by cid";
        List<Category> list = template.query(sql, new BeanPropertyRowMapper<>(Category.class));
        return list;
    }

    @Override
    public String getCname(int cid) {
        String sql = "select cname from tab_category where cid=?";
        String cname = template.queryForObject(sql, String.class, cid);
        return cname;
    }
}
