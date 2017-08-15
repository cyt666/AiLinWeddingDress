package com.ailin.dao;

import com.ailin.model.TbNews;

import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 */
public interface TbNewsDao {
    public List<TbNews> selectAllNews();
}
