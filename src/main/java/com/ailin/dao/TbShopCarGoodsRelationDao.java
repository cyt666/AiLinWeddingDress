package com.ailin.dao;

import com.ailin.model.TbShopCarGoodsRelation;
import com.ailin.model.TbShopGoodsRelation;

import java.util.HashMap;

public interface TbShopCarGoodsRelationDao {

	int deleteByPrimaryKey(TbShopCarGoodsRelation record);// 删除

	int insert(TbShopCarGoodsRelation record);// 增加

	TbShopCarGoodsRelation selectByPrimaryKey(Integer id);// 查找

	int updateByPrimaryKey(TbShopCarGoodsRelation record);// 修改

	TbShopCarGoodsRelation selectTbShopCarGoodsRelationAndTbShopGoodsRelation(
			Integer goodsId);

	int selectByshopCarIdAndGoodsId(HashMap<Object,Object> map);
}