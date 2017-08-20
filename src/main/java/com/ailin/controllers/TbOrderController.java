package com.ailin.controllers;

import com.ailin.dao.TbOrderDao;
import com.ailin.model.pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/order")
public class TbOrderController {

    @Autowired
    private TbOrderDao tbOrderDao;

    @RequestMapping("selectAllorder")
    public String orderAll(HttpServletRequest req) {
        int consumerId = Integer.parseInt(req.getParameter("consumerId"));
        System.out.println("consumerId=" + "  " + consumerId);
        List<pojo> selectOrderAlllist = tbOrderDao.selectOrderAll(consumerId);
        for (pojo pojo : selectOrderAlllist) {
            System.out.println(pojo + "   00000");
        }
        return "success";
    }


}
