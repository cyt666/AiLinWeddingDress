package com.ailin.service;

import com.ailin.model.TbShopCarGoodsRelation;
import com.ailin.model.TbShopGoodsRelation;

import java.util.HashMap;


public interface TbShopCarGoodsRelationService  {

    public int insert(TbShopCarGoodsRelation record);// ����

    public int deleteByPrimaryKey(TbShopCarGoodsRelation record);// ɾ��
    public int selectByshopCarIdAndGoodsId(HashMap<Object,Object> map);
}
