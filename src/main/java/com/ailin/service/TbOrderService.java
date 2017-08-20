package com.ailin.service;

import com.ailin.model.TbOrder;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface TbOrderService {
    public int deleteByPrimaryKey(TbOrder record);
    public int insert(TbOrder record);
    public int updateByPrimaryKey(TbOrder record);
    public int selectByOrderNumber(String orderNumber);
}
