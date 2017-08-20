package com.ailin.dao;

import com.ailin.model.TbShopCarGoodsRelation;
import com.ailin.model.TbShopGoodsRelation;

import java.util.HashMap;

public interface TbShopCarGoodsRelationDao {

	int deleteByPrimaryKey(TbShopCarGoodsRelation record);// ɾ��

	int insert(TbShopCarGoodsRelation record);// ����

	TbShopCarGoodsRelation selectByPrimaryKey(Integer id);// ����

	int updateByPrimaryKey(TbShopCarGoodsRelation record);// �޸�

	TbShopCarGoodsRelation selectTbShopCarGoodsRelationAndTbShopGoodsRelation(
			Integer goodsId);

	int selectByshopCarIdAndGoodsId(HashMap<Object,Object> map);
}