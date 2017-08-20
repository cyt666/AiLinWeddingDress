package com.ailin.controller;

import com.ailin.model.Goods;
import com.ailin.model.GoodsImages;
import com.ailin.model.Shop;
import com.ailin.service.GoodsService;
import com.ailin.service.ShopService;
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
@RequestMapping("goodsController")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @Resource
    private ShopService shopService;

    //商品单查
    @ResponseBody
    @RequestMapping(value = "/goodsDetail", produces = "text/json;charset=utf-8")
    public String goodsDetail(@RequestBody String goodsIds, @RequestBody String shopsId, Model model) {
        Integer goodsId = Integer.parseInt(goodsIds);
        Integer shopId = Integer.parseInt(shopsId);
        if ((goodsId == null || goodsId < 0) && (shopId == null || shopId < 0)) {
            return "errorPage";
        } else {
            Shop shop = shopService.selectShopById(shopId);
            Goods goods = goodsService.selectGoodsById(goodsId);
            List<GoodsImages> goodsImagesList = goodsService.selectImageByGoodsId(goodsId);
            if ((shop == null) || (goods == null) || (goodsImagesList == null)) {
                return "errorPage";
            } else {
                model.addAttribute("shop", shop);
                model.addAttribute("goods", goods);
                model.addAttribute("goodsImagesList", goodsImagesList);
                return "goodsDetail";
            }
        }
    }

    //根据条件查询多个商品
    @RequestMapping(value = "/allGoods", produces = "text/json;charset=utf-8")
    public String allGoods(@RequestBody String goodsName, @RequestBody String orders, Model model) {
        Integer order = Integer.parseInt(orders);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        if (goodsName != null) {
            map.put("goodsName", goodsName);
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
        List<Goods> goodses = goodsService.selectAllGoods(map);
        model.addAttribute("goodsList", goodses);
        return "allGoods";


    }
}
