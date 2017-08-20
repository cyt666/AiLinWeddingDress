package com.ailin.manager;

import com.ailin.dao.GoodsDao;
import com.ailin.model.Goods;
import com.ailin.model.GoodsImages;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Component
public class GoodsManager {
    @Resource
    private GoodsDao goodsDao;

    public List<Goods> selectAllGoods(HashMap map) {
        List<Goods> goodses = goodsDao.selectAllGoods(map);
        return goodses;
    }

    public Goods selectGoodsById(Integer goodsId) {
        Goods goods = goodsDao.selectGoodsById(goodsId);
        return goods;
    }

    public List<GoodsImages> selectImageByGoodsId(Integer goodsId) {
        List<GoodsImages> goodsImages = goodsDao.selectImageByGoodsId(goodsId);
        return goodsImages;
    }
}
