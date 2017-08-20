package com.ailin.service;


import com.ailin.model.TbOrder;
import com.ailin.model.TbOrderGoodsRelation;

public interface TbOrderGoodsRelationService {
    public  int deleteByPrimaryKey(TbOrderGoodsRelation record);
    public int insert(TbOrderGoodsRelation record);
    public int updateByPrimaryKey(TbOrderGoodsRelation record);
}
