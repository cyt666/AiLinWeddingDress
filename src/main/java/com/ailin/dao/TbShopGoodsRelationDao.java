package com.ailin.dao;

import java.util.HashMap;

import com.ailin.model.TbShopCarGoodsRelation;
import com.ailin.model.TbShopGoodsRelation;

public interface TbShopGoodsRelationDao {

	int deleteByPrimaryKey(Integer id);

	int insert(TbShopGoodsRelation record);

	TbShopGoodsRelation selectByItemId(Integer id);

	int updateByPrimaryKey(TbShopGoodsRelation record);

	TbShopGoodsRelation selectId(HashMap<Object, Object> map);

	TbShopGoodsRelation selectByShopIdAndGoodId(HashMap<Object, Object> map);


}