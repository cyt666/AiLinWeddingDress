package com.ailin.dao;

import com.ailin.model.TbOrder;

import java.util.List;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface TbOrderDao {
    int deleteByPrimaryKey(TbOrder record);

    int insert(TbOrder record);

    TbOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(TbOrder record);

    int selectByOrderNumber(String orderNumber);

}
