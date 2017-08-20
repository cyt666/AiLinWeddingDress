package com.ailin.manager;

import com.ailin.model.News;
import com.ailin.dao.HomePageDao;
import com.ailin.model.HomePageImage;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Administrator on 2017/8/20.
 */
@Component
public class HomePageManager {
    @Resource
   private HomePageDao homePageDao;
    /**
     * 处理首页轮播图从数据库查找回来数据的问题
     * 1.取出的数据为空
     * 2.取出的数据数量不足
     * 3.取出的数据正确
     *
     * @return
     */
    public List<HomePageImage> homePageImage() {
        List<HomePageImage> homePageImages=homePageDao.homePageImage();
        return homePageImages;
    }

    /**
     * 处理查找公告数据出现的问题
     * 1.查找回来的数据为NULL
     * 2.查找回来的数据完整
     *
     * @return
     */
    public List<News> news() {
        List<News> newsList = homePageDao.news();
        return newsList;
    }

}
