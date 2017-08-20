package com.ailin.controller;

import com.ailin.dao.TbOrderDao;
import com.ailin.dao.TbOrderGoodsRelationDao;
import com.ailin.dao.TbShopGoodsRelationDao;
import com.ailin.model.TbOrder;
import com.ailin.model.TbOrderGoodsRelation;
import com.ailin.model.TbShopGoodsRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Administrator on 2017/8/18.
 */
@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private TbOrderDao tbOrderDao;
    @Autowired
    private TbOrderGoodsRelationDao tbOrderGoodsRelationDao;
    @Autowired
    private TbShopGoodsRelationDao tbShopGoodsRelationDao;

    @RequestMapping("orderInsert")
    public String orderInsert(HttpServletRequest req) {
        int num = Integer.parseInt(req.getParameter("num"));//一个定单存在几家商铺


        //生成订单表
        String orderNumber = generateOrderId();
        int consumerId = Integer.parseInt(req.getParameter("consumerId"));
        int addressId = Integer.parseInt(req.getParameter("addressId"));
//        Byte transferWay = Byte.valueOf(req.getParameter("transferWay"));
//        Byte payWay = Byte.valueOf(req.getParameter("payWay"));
//        String transferTime = req.getParameter("transferTime");
//        int couponId = Integer.parseInt(req.getParameter("couponId"));
//        String price1 = req.getParameter("price");
//        BigDecimal price = new BigDecimal(price1);
//        String remark = req.getParameter("remark");
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderNumber(orderNumber);
        tbOrder.setAddressId(addressId);
        tbOrder.setConsumerId(consumerId);
//        tbOrder.setCouponId(couponId);
//        tbOrder.setPayWay(payWay);
//        tbOrder.setPrice(price);
//        tbOrder.setRemark(remark);
//        tbOrder.setTransferTime(transferTime);
//        tbOrder.setTransferWay(transferWay);
        tbOrderDao.insert(tbOrder);


        //生成订单明细
        int i = 0;
        for (i = 0; i < num; i++) {
            int shopId = Integer.parseInt(req.getParameter("shopId"));
            int goodsId = Integer.parseInt(req.getParameter("goodsId"));
            HashMap<Object, Object> map = new HashMap<Object, Object>();
            map.put("shopId", shopId);
            map.put("goodsId", goodsId);
            TbShopGoodsRelation tbShopGoodsRelation = tbShopGoodsRelationDao.selectId(map);
            Integer id1 = tbShopGoodsRelation.getId();//shopgoodsrelation中的主键


            int id = tbOrderDao.selectByOrderNumber("orderNumber");//得到生成的订单id
            String size = req.getParameter("size");
            int count = Integer.parseInt(req.getParameter("count"));
            TbOrderGoodsRelation orderGoodsRelation = new TbOrderGoodsRelation();
            orderGoodsRelation.setCount(count);
            orderGoodsRelation.setGoodsId(id1);//shopgoodsrelation中的主键
            orderGoodsRelation.setOrderId(id);
            orderGoodsRelation.setSize(size);
            tbOrderGoodsRelationDao.insert(orderGoodsRelation);
        }




        return "success";

    }

    //自动生成订单编号
    final int MAX = 999999;
    int num = 0;

    private synchronized String generateOrderId() {
        long currentTimeMillis = System.currentTimeMillis();
        String str = Long.toString(currentTimeMillis);
        String orderId = str + num;
        num++;
        if (num == MAX) {
            num = 0;
        }
        return orderId;
    }



    public String orderDelete(HttpServletRequest req){
        int orderId = Integer.parseInt(req.getParameter("id"));
        TbOrderGoodsRelation tbOrderGoodsRelation = new TbOrderGoodsRelation();
        tbOrderGoodsRelation.setOrderId(orderId);
        TbOrder tbOrder = new TbOrder();
        tbOrderDao.deleteByPrimaryKey(tbOrder);
        tbOrderGoodsRelationDao.deleteByPrimaryKey(tbOrderGoodsRelation);
            return "success";
    }
}
