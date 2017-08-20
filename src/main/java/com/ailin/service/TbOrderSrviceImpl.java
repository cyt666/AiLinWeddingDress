package com.ailin.service;

import com.ailin.dao.TbOrderDao;
import com.ailin.model.TbOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/18.
 */
@Service
public class TbOrderSrviceImpl  implements TbOrderService{
    @Autowired
    private TbOrderDao tbOrderDao;
    public int deleteByPrimaryKey(TbOrder record) {
        int delete = tbOrderDao.deleteByPrimaryKey(record);
        return delete;
    }

    public int insert(TbOrder record) {
        int insert = tbOrderDao.insert(record);
        return insert;
    }
    public int updateByPrimaryKey(TbOrder record) {
        int update = tbOrderDao.updateByPrimaryKey(record);
        return update;
    }

    public int selectByOrderNumber(String orderNumber) {
        int  selectByOrderNumber= tbOrderDao.selectByOrderNumber(orderNumber);
        return selectByOrderNumber;
    }
}
