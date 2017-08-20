package com.ailin.service;

import com.ailin.manager.GoodsManager;
import com.ailin.model.Goods;
import com.ailin.model.GoodsImages;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Service
public class GoodsService {
    @Resource
    private GoodsManager goodsManager;

    public List<Goods> selectAllGoods(HashMap map) {
        List<Goods> goodses = goodsManager.selectAllGoods(map);
        return goodses;
    }

    public Goods selectGoodsById(Integer goodsId) {
        Goods goods = goodsManager.selectGoodsById(goodsId);
        return goods;
    }

    public List<GoodsImages> selectImageByGoodsId(Integer goodsId) {
        List<GoodsImages> goodsImages = goodsManager.selectImageByGoodsId(goodsId);
        return goodsImages;
    }
}
