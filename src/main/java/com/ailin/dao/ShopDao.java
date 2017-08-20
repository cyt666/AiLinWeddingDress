package com.ailin.dao;

import com.ailin.model.Goods;
import com.ailin.model.Shop;
import org.springframework.stereotype.Repository;
import com.ailin.model.Shop;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Repository
public interface ShopDao {

    /**
     * 根据shopId查询店铺信息
     * @return 返回店铺信息
     */
     Shop selectShopById(Integer shopId);
    /**
     * 根据查询id查询商品信息
     * @return 返回商品信息列表
     */
    List<Goods> selectGoodsByShopId(HashMap map);
    /**
     * 根据查询名字查店铺
     * @return 返回店铺集合
     */
    List<Shop> selectShopByShopName(HashMap map);

}
