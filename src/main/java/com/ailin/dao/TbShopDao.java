package com.ailin.dao;

import com.ailin.model.TbShop;
import com.ailin.model.TbShopGoodsRelation;

import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
public interface TbShopDao {
    //模糊查询店铺（单查店铺表就好）
    List<TbShopGoodsRelation> selectShopByName(String shopName);
}
