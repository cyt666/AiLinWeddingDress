package com.ailin.manager;

import com.ailin.dao.ShopDao;
import com.ailin.model.Goods;
import com.ailin.model.Shop;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Component
public class ShopManager {
    @Resource
    private ShopDao shopDao;
    public Shop selectShopById(Integer shopId){
        Shop shop = shopDao.selectShopById(shopId);
        return shop;
    }
    public List<Goods> selectGoodsByShopId(HashMap map){
        List<Goods> goodses = shopDao.selectGoodsByShopId(map);
        return goodses;
    }
    public List<Shop> selectShopByShopName(HashMap map){
        List<Shop> shops = shopDao.selectShopByShopName(map);
        return shops;
    }
}
