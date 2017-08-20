package com.ailin.dao;

import com.ailin.model.HomePageImage;
import com.ailin.model.News;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Repository
public interface HomePageDao {
    /**
     * 查询首页轮播图
     * @return 返回轮播图信息
     */
    List<HomePageImage> homePageImage();
    /**
     * 查询公告
     * @return 返回表中的未被删除的所有公告
     */
     List<News> news();
    /**
     * 查询热门商品信息
     * @return 返回商品信息包装类：GoodsImage和Goods
     */
   // List<GoodsVO> queryHotGoods();
}
