package com.ailin.service;

import com.ailin.model.News;
import com.ailin.manager.HomePageManager;
import com.ailin.model.HomePageImage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Service
public class HomePageService {
    @Resource
    private HomePageManager homePageManager;

    /**
     * 返回公告信息，包含内容，标题
     * @return
     */
    public List<News>  news() {
        return homePageManager.news();
    }

    /**
     * 返回首页轮播图，按位置顺序排好
     * @return
     */
    public List<HomePageImage> homePageImage() {
        return homePageManager.homePageImage();
    }
}

