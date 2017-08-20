package com.ailin.controller;

import com.ailin.model.News;
import com.ailin.model.HomePageImage;
import com.ailin.model.News;
import com.ailin.service.HomePageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Controller
@RequestMapping("/HomePageController")
public class HomePageController{
    @Resource
    private HomePageService homePageService;

    @ResponseBody
    @RequestMapping("/homePage")
    public String homePage(Model model){
        List<HomePageImage> homePageImages =homePageService.homePageImage();
        List<News> news=homePageService.news();
        model.addAttribute("homePageImage",homePageImages);
        model.addAttribute("news",news);
        return "homePage";
    }
}