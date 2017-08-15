package com.ailin.test;

import com.ailin.dao.TbShopDao;
import com.ailin.model.*;
import com.ailin.service.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.html.HTMLDocument;
import java.awt.event.ItemEvent;
import java.awt.print.Book;
import java.io.Reader;
import java.util.List;

/**
 * Created by Administrator on 2017/8/10.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring/spring-dao.xml");
        //轮播图测试
//        TbHomeRotationDaoimpl tbHomeRotationDaoimpl =(TbHomeRotationDaoimpl) context.getBean("tbHomeRotationDaoimpl");
//        List<TbHomeRotation> tbHomeRotations = tbHomeRotationDaoimpl.selectAllHomeRotation();
//        for (TbHomeRotation tbHomeRotation : tbHomeRotations) {
//            System.out.println(tbHomeRotation);
//        }
        //消息测试
//        TbNewsDaoimpl tbNewsDaoimpl = (TbNewsDaoimpl)context.getBean("tbNewsDaoimpl");
//        List<TbNews> tbNewses = tbNewsDaoimpl.selectAllNews();
//        for (TbNews tbNewse : tbNewses) {
//            System.out.println(tbNewse);
//     }

//        TbShopGoodsRelationDaoimpl goodsDaoa = (TbShopGoodsRelationDaoimpl) context.getBean("tbShopGoodsRelationDaoimpl");
//        List<TbShopGoodsRelation> selectAllGoods = goodsDaoa.selectAllGoods();
//        for (TbShopGoodsRelation tbShopGoodsRelation : selectAllGoods) {
//            System.out
//                    .println("关系主键     " + tbShopGoodsRelation.getId() + "  ");
//            System.out.println("店铺信息    " + tbShopGoodsRelation.getShop()
//                    + "   ");
//            System.out
//                    .println("商品信息  " + tbShopGoodsRelation.getGoods() + "  ");
//
//            System.out.println("图片信息：  " + tbShopGoodsRelation.getGoodsImageList());
//            System.out.println("======");
//        }
        TbShopGoodsRelationDaoimpl goodsDao = (TbShopGoodsRelationDaoimpl) context.getBean("tbShopGoodsRelationDaoimpl");
        List<TbShopGoodsRelation> tbShopGoodsRelations = goodsDao.selectGoodsById(11);
        for (TbShopGoodsRelation tbShopGoodsRelation : tbShopGoodsRelations) {
            System.out
                    .println("关系主键     " + tbShopGoodsRelation.getId() + "  ");
            System.out.println("店铺信息    " + tbShopGoodsRelation.getShop()
                    + "   ");
            System.out
                    .println("商品信息  " + tbShopGoodsRelation.getGoods() + "  ");
            System.out.println("图片信息：" + tbShopGoodsRelation.getGoodsImageList());

            System.out.println("======");
        }

    }
}




