package com.ailin.dao;

import java.util.List;

import com.ailin.model.ShopCarGoods;
import com.ailin.model.TbShopCar;

public interface TbShopCarDao {

	int deleteByPrimaryKey(Integer id);// ɾ��һ�����ﳵ

	int insert(TbShopCar record);// ����һ�����ﳵ

	TbShopCar selectByPrimaryKey(Integer id);// ����һ�����ﳵ

	int updateByPrimaryKey(TbShopCar record);// �޸�һ�����ﳵ

	int selectByConsumerId(Integer consumerId);

	List<TbShopCar> selectByShopCarId(Integer id);

	 List<ShopCarGoods> selectAllShopCarGoods(Integer id);
}