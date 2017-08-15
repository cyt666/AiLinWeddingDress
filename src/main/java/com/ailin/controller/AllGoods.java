package com.ailin.controller;

import com.ailin.dao.TbGoodsDao;
import com.ailin.model.*;
import com.ailin.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/8/13.
 */

@Controller
@RequestMapping("/AllGoods")
public class AllGoods {
//    @Autowired
//    private TbHomeRotationDaoimpl tbHomeRotationDaoimpl;
//    @Autowired
//    private TbNewsDaoimpl tbNewsDaoimpl;
//    @Autowired
//    private TbShopGoodsRelationDaoimpl tbShopGoodsRelationDaoimpl;
//    @Autowired
//    private TbGoodsDaoimpl tbGoodsDaoimpl;
//    @Autowired
//    private TbGoodsImageDaoimpl tbGoodsImageDaoimpl;
//    @Autowired
//    private TbShopDaoimpl tbShopDaoimpl;
//
//    @RequestMapping("tbHomeRotation")
//    @ResponseBody
//    public List<TbHomeRotation> tbHomeRotation() {
//        List<TbHomeRotation> tbHomeRotationList = tbHomeRotationDaoimpl.selectAllHomeRotation();
//        for (TbHomeRotation tbHomeRotation : tbHomeRotationList) {
//            System.out.println(tbHomeRotation);
//        }
//        return tbHomeRotationList;
//    }
//
//    @RequestMapping("tbNews")
//    @ResponseBody
//    public List<TbNews> tbNews() {
//        List<TbNews> tbNewsesList = tbNewsDaoimpl.selectAllNews();
//        for (TbNews tbNews : tbNewsesList) {
//            System.out.println(tbNews);
//        }
//        return tbNewsesList;
//    }
//
//    @RequestMapping("showGoods")
//    @ResponseBody
//    public List<TbShopGoodsRelation> showGoods() {
//        List<TbShopGoodsRelation> allGoodsList = tbShopGoodsRelationDaoimpl.selectAllGoods();
//        for (TbShopGoodsRelation tbShopGoodsRelation : allGoodsList) {
//            System.out.println(tbShopGoodsRelation);
//        }
//        return allGoodsList;
//    }

}