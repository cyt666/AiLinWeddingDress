package com.ailin.service;

import com.ailin.model.TbShopCarGoodsRelation;
import com.ailin.model.TbShopGoodsRelation;

import java.util.HashMap;


public interface TbShopCarGoodsRelationService  {

    public int insert(TbShopCarGoodsRelation record);// Ôö¼Ó

    public int deleteByPrimaryKey(TbShopCarGoodsRelation record);// É¾³ý
    public int selectByshopCarIdAndGoodsId(HashMap<Object,Object> map);
}
