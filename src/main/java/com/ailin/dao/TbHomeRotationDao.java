package com.ailin.dao;

import com.ailin.model.TbHomeRotation;

import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 * 首页轮播图全查
 */
public interface TbHomeRotationDao{
    public List<TbHomeRotation> selectAllHomeRotation();
}

