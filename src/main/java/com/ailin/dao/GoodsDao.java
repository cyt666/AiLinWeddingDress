package com.ailin.dao;

import com.ailin.model.Goods;
import com.ailin.model.GoodsImages;
import com.ailin.model.HomePageImage;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Repository
public interface GoodsDao {
    /**
     * 根据查询条件查商品
     * @return 返回商品信息集合
     */
    List<Goods>selectAllGoods(HashMap map);
    /**
     * 根据查询id查商品
     * @return 返回商品信息
     */
    Goods selectGoodsById(Integer goodsId);
    /**
     * 根据查询id查商品四张图片
     * @return 返回图片信息
     */
    List<GoodsImages> selectImageByGoodsId(Integer goodsId);
}
