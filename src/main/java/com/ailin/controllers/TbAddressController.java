package com.ailin.controllers;

import com.ailin.dao.TbAddressDao;
import com.ailin.model.TbAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/8/12.
 */
@Controller
@RequestMapping("tbAddress")
public class TbAddressController {
@Autowired
private TbAddressDao tbAddressDao;
@RequestMapping("delete")
    public String delete(HttpServletRequest req){
        int addressId = Integer.parseInt(req.getParameter("id"));
        tbAddressDao.deleteByPrimaryKey(addressId);
        return  "success";
    }

@RequestMapping("insert")
    public String insert(HttpServletRequest req){
    int addressId = Integer.parseInt(req.getParameter("id"));
    TbAddress tbAddress = new TbAddress();
    int  consumerId =Integer.parseInt(req.getParameter("ConsumerId"));
    String consumerName = req.getParameter("ConsumerName");
    String consumerPhone = req.getParameter("ConsumerPhone");
    String province = req.getParameter("Province");
    String city = req.getParameter("City");
    String district = req.getParameter("District");
    String street = req.getParameter("Street");
    String post = req.getParameter("Post");
    String detail = req.getParameter("Detail");

    tbAddress.setConsumerId(consumerId);
    tbAddress.setConsumerName(consumerName);
    tbAddress.setConsumerPhone(consumerPhone);
    tbAddress.setProvince(province);
    tbAddress.setCity(city);
    tbAddress.setDistrict(district);
    tbAddress.setStreet(street);
    tbAddress.setPost(post);
    tbAddress.setDetail(detail);

    tbAddressDao.insertSelective(tbAddress);
    return "success";
    }


    public String update(HttpServletRequest req){
        int addressId = Integer.parseInt(req.getParameter("id"));
        TbAddress tbAddress = new TbAddress();
        int  consumerId =Integer.parseInt(req.getParameter("ConsumerId"));
        String consumerName = req.getParameter("ConsumerName");
        String consumerPhone = req.getParameter("ConsumerPhone");
        String province = req.getParameter("Province");
        String city = req.getParameter("City");
        String district = req.getParameter("District");
        String street = req.getParameter("Street");
        String post = req.getParameter("Post");
        String detail = req.getParameter("Detail");

        tbAddress.setConsumerId(consumerId);
        tbAddress.setConsumerName(consumerName);
        tbAddress.setConsumerPhone(consumerPhone);
        tbAddress.setProvince(province);
        tbAddress.setCity(city);
        tbAddress.setDistrict(district);
        tbAddress.setStreet(street);
        tbAddress.setPost(post);
        tbAddress.setDetail(detail);
        tbAddressDao.updateByPrimaryKeySelective(tbAddress);
        return "success";
    }
}
