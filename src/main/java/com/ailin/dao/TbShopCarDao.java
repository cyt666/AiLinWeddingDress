package com.ailin.dao;

import java.util.List;

import com.ailin.model.ShopCarGoods;
import com.ailin.model.TbShopCar;

public interface TbShopCarDao {

	int deleteByPrimaryKey(Integer id);// 删除一个购物车

	int insert(TbShopCar record);// 增加一个购物车

	TbShopCar selectByPrimaryKey(Integer id);// 查找一个购物车

	int updateByPrimaryKey(TbShopCar record);// 修改一个购物车

	int selectByConsumerId(Integer consumerId);

	List<TbShopCar> selectByShopCarId(Integer id);

	 List<ShopCarGoods> selectAllShopCarGoods(Integer id);
}