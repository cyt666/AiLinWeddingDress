package com.ailin.controller;

import com.ailin.model.Goods;
import com.ailin.model.HomePageImage;
import com.ailin.model.News;
import com.ailin.model.Shop;
import com.ailin.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Controller
@RequestMapping("shop")
public class ShopController {
    @Resource
    private ShopService shopService;

    @ResponseBody
    //店铺页面显示
    @RequestMapping(value = "/shopDetail", produces = "text/json;charset=utf-8")
    public String shopDetail(@RequestBody String shopIds, @RequestBody String goodsName, @RequestBody String orders,@RequestBody String goodsTime, Model model) {
        Integer shopId = Integer.parseInt(shopIds);
        Integer order = Integer.parseInt(orders);
        if (shopId == null || shopId < 0) {
            return "errorPage";
        } else {
            Shop shop1 = shopService.selectShopById(shopId);
            if (shop1 == null) {
                return "errorPage";
            } else {
                HashMap<Object, Object> map = new HashMap<Object, Object>();
                map.put("shopId", shopId);
                if (goodsName != null) {
                    map.put("goodsName", goodsName);
                }
                if (goodsTime != null) {
                    map.put("goodsTime", goodsTime);
                }
                if (order != null && order == 1) {
                    map.put("order", 1);
                }
                if (order != null && order == 2) {
                    map.put("order", 2);
                }
                if (order != null && order == 3) {
                    map.put("order", 3);
                }
                if (order != null && order == 4) {
                    map.put("order", 4);
                }
                List<Goods> goodses = shopService.selectGoodsByShopId(map);
                Shop shop = shopService.selectShopById(shopId);
                model.addAttribute("goodsList", goodses);
                model.addAttribute("shop", shop);
                return "shopDetail";
            }
        }

    }
}
