package com.ailin.dao;

import com.ailin.model.TbOrder;
import com.ailin.model.pojo;

import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */
public interface TbOrderDao {

    int deleteByPrimaryKey(Integer id);


    int insert(TbOrder record);


    int insertSelective(TbOrder record);

    TbOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbOrder record);


    int updateByPrimaryKey(TbOrder record);


    // 查询订单全部信息

    List<pojo> selectOrderAll(Integer consumerId);
}
