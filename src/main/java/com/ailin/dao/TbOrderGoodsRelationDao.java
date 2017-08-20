package com.ailin.dao;

import com.ailin.model.TbOrder;
import com.ailin.model.TbOrderGoodsRelation;

public interface TbOrderGoodsRelationDao {

    int deleteByPrimaryKey(TbOrderGoodsRelation record);


    int insert(TbOrderGoodsRelation record);


    int updateByPrimaryKey(TbOrderGoodsRelation record);
}