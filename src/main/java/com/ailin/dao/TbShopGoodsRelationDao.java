package com.ailin.dao;

import com.ailin.model.TbGoods;
import com.ailin.model.TbShopGoodsRelation;

import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
public interface TbShopGoodsRelationDao {
    //首页无限加载，点击发现商品分类，店铺商品查询
    List<TbShopGoodsRelation> selectAllGoods(Integer shopsId,String goodsName,Integer conditionId);

    //商品单查(传递shopGoodsRelationId主键)
    List<TbShopGoodsRelation> selectGoodsById(Integer shopGoodsRelationId);

}
