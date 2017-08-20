package com.ailin.controllers;

import com.ailin.dao.TbConsumerDao;
import com.ailin.model.TbAddress;
import com.ailin.model.TbConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/8/12.
 */
@Controller
@RequestMapping("tbconsumer")
public class TbConsumerController {
    @Autowired
    private TbConsumerDao tbconsumerDao;

    @RequestMapping("login")
    public String Login(TbConsumer tbconsumer, HttpServletRequest req) {
        TbConsumer tbconsumer2 = tbconsumerDao.login(tbconsumer);
        System.out.println(tbconsumer2);
        if (tbconsumer2 != null) {
            List<TbConsumer> tbconsumerList = tbconsumerDao.selectAll();
            req.setAttribute("tbconsumerList", tbconsumerList);
            return "success";
        }
        return "error";
    }

    @RequestMapping("selectAddressAndConsumer")
    public List<TbAddress> selectAddressAndConsumer(Integer consumerId,
                                                    HttpServletRequest req) {
        List<TbAddress> AddressAndConsumerList = tbconsumerDao
                .selectAddressAndConsumer(consumerId);

        for (TbAddress tbAddress : AddressAndConsumerList) {
            System.out.println(tbAddress + " 6666666666666");
        }
        return AddressAndConsumerList;
    }


    public int updateByPrimaryKeySelective(TbConsumer record,HttpServletRequest req){
        int num=tbconsumerDao.updateByPrimaryKeySelective(record);

        return 0;
    }


}

