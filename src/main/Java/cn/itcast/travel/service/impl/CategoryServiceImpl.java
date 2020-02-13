package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import com.alibaba.fastjson.JSON;
import redis.clients.jedis.Jedis;

import java.util.List;


/**
 * Created by cdx on 2020/1/13.
 * desc:
 */
public class CategoryServiceImpl implements CategoryService {
    private CategoryDao dao = new CategoryDaoImpl();

    @Override
    public String findAll() {
        Jedis jedis = JedisUtil.getJedis();
        String category = jedis.get("category");

        if (category == null || category == "") {
            List<Category> list = dao.findAll();
            category = JSON.toJSON(list).toString();
            jedis.set("category", category);
        }
        jedis.close();
        return category;
    }

    @Override
    public String getCname(int cid) {
        return dao.getCname(cid);
    }

}
