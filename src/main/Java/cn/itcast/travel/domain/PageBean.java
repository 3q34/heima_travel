package cn.itcast.travel.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by cdx on 2020/1/13.
 * desc:
 */
@Data
public class PageBean<T> {
    private int totalCount;
    private int totalPage;
    private List<T> list;
    private int pageSize;
    private int currentPage;
}
