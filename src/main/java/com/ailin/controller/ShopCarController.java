package com.ailin.controller;

import java.lang.Object;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ailin.dao.TbShopCarDao;
import com.ailin.dao.TbShopCarGoodsRelationDao;
import com.ailin.dao.TbShopGoodsRelationDao;
import com.ailin.dao.UserDao;
import com.ailin.model.ShopCarGoods;
import com.ailin.model.TbShopCarGoodsRelation;
import com.ailin.model.TbShopGoodsRelation;
import com.ailin.model.User;
import org.omg.CORBA.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("shopcar")

public class ShopCarController {
	@Autowired
	private UserDao userDao;
	@Autowired
	private TbShopCarDao tbShopCarDao;
	@Autowired
	private TbShopCarGoodsRelationDao tbShopCarGoodsRelationDao;
	@Autowired
	private TbShopGoodsRelationDao tbShopGoodsRelationDao;


	@RequestMapping("login")
	public String login(User user) {

		User user2 = userDao.login(user);
		if (user2 != null) {
	System.out.println(user2.getPass());
			System.out.println(user2.getUsername());
			return "success";
		}
		return "error";
	}

	@RequestMapping("car")
	public String car(HttpServletRequest req) {
	System.out.println("ooooo");
		int consumerId = Integer.parseInt(req.getParameter("consumerId"));
		System.out.println("consumerId等于" + "   " + consumerId);
		int id = tbShopCarDao.selectByConsumerId(consumerId);
		System.out.println("id等于 " + id);
		List<ShopCarGoods> goodsList = tbShopCarDao.selectAllShopCarGoods(id);
		for (ShopCarGoods list : goodsList) {
			System.out.println(list + "     MMMMM");
		}

		return "shopcar";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest req){
		int shopId = Integer.parseInt(req.getParameter("shopId"));
		int goodsId= Integer.parseInt(req.getParameter("goodsId"));//真实的商品Id
		HashMap<Object ,Object > map = new HashMap<Object,Object>();
		map.put("shopId",shopId);
		map.put("goodsId", goodsId);
		TbShopGoodsRelation selectId = tbShopGoodsRelationDao.selectId(map);
		int goodsId1 = selectId.getId();//ShopCarGoods表中的goodsId
		System.out.println(goodsId1);
		int consumerId = Integer.parseInt(req.getParameter("consumerId"));
		int ShopCarId = tbShopCarDao.selectByConsumerId(consumerId);
		System.out.println(ShopCarId);
		TbShopCarGoodsRelation tbShopCarGoodsRelation = new TbShopCarGoodsRelation();
		tbShopCarGoodsRelation.setShopCarId(ShopCarId);
		tbShopCarGoodsRelation.setGoodsId(goodsId1);
		tbShopCarGoodsRelationDao.deleteByPrimaryKey(tbShopCarGoodsRelation);
		return "success";
	}

	@RequestMapping("insert")
	public String insert(HttpServletRequest req){

		//通过shopId和goodsId得到shopgoods表的id
		int shopId = Integer.parseInt(req.getParameter("shopId"));
		int goodsId= Integer.parseInt(req.getParameter("goodsId"));//真实的商品Id
		HashMap<Object ,Object > map = new HashMap<Object,Object>();
		map.put("shopId",shopId);
		map.put("goodsId", goodsId);
		TbShopGoodsRelation selectId = tbShopGoodsRelationDao.selectId(map);
		int goodsId1 = selectId.getId();//ShopCarGoods表中的goodsId
		System.out.println(goodsId1);
		//通过consumerId找到ShopcarId
		int consumerId = Integer.parseInt(req.getParameter("consumerId"));
		int ShopCarId = tbShopCarDao.selectByConsumerId(consumerId);
		//	接受前端传递的参数
		String size =req.getParameter("size");
		int count = Integer.parseInt(req.getParameter("count"));
		//创建新对象
		TbShopCarGoodsRelation carGoods = new TbShopCarGoodsRelation();
		carGoods.setShopCarId(ShopCarId);
		carGoods.setGoodsId(goodsId1);
		carGoods.setSize(size);
		carGoods.setCount(count);
		 tbShopCarGoodsRelationDao.insert(carGoods);

		return "success";
	}
	@RequestMapping("update")
	public String update(HttpServletRequest req){
		int shopId = Integer.parseInt(req.getParameter("shopId"));
		int goodsId= Integer.parseInt(req.getParameter("goodsId"));

		int cousumerId = Integer.parseInt(req.getParameter("consumerId"));
		int shopCarId = tbShopCarDao.selectByConsumerId(cousumerId);
		String size =req.getParameter("size");
		int count = Integer.parseInt(req.getParameter("count"));


		HashMap<Object ,Object > map = new HashMap<Object,Object>();
		map.put("shopId",shopId);
		map.put("goodsId", goodsId);
		TbShopGoodsRelation selectId = tbShopGoodsRelationDao.selectId(map);//shopgoodsrelation中的Id
		int goodsId1=selectId.getId();
		TbShopCarGoodsRelation tbShopCarGoodsRelation = new TbShopCarGoodsRelation();
		tbShopCarGoodsRelation.setShopCarId(shopCarId);
		tbShopCarGoodsRelation.setGoodsId(goodsId1);
		tbShopCarGoodsRelation.setSize(size);
		tbShopCarGoodsRelation.setCount(count);
		tbShopCarGoodsRelationDao.updateByPrimaryKey(tbShopCarGoodsRelation);


		return "success";
	}


}
