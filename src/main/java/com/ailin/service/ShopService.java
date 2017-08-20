package com.ailin.service;

import com.ailin.manager.ShopManager;
import com.ailin.model.Goods;
import com.ailin.model.Shop;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Service
public class ShopService {
    @Resource
    private ShopManager shopManager;
    public Shop selectShopById(Integer shopId){
        Shop shop = shopManager.selectShopById(shopId);
        return shop;
    }
    public List<Goods> selectGoodsByShopId(HashMap map){
        List<Goods> goodses = shopManager.selectGoodsByShopId(map);
        return goodses;
    }


    public List<Shop> selectShopByShopName(HashMap map){
        List<Shop> shops = shopManager.selectShopByShopName(map);
        return shops;
    }
}
