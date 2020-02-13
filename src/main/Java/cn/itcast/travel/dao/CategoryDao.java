package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Category;

import java.util.List;

/**
 * Created by cdx on 2020/1/13.
 * desc:
 */
public interface CategoryDao {
    List<Category> findAll();
    String getCname(int cid);
}
