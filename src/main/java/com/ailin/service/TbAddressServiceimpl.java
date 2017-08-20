package com.ailin.service;

import com.ailin.dao.TbAddressDao;
import com.ailin.dao.TbOrderDao;
import com.ailin.model.TbAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/20.
 */
@Service
public class TbAddressServiceimpl implements TbAddressService {
    @Autowired
    private TbAddressService tbAddressService;


    public int deleteByPrimaryKey(Integer id) {
        int delete=tbAddressService.deleteByPrimaryKey(id);
        return delete;
    }

    public int insertSelective(TbAddress record) {
       int insertSelective=tbAddressService.insertSelective(record);
        return insertSelective;
    }

    public int updateByPrimaryKeySelective(TbAddress record) {
        int updateByPrimaryKeySelective=tbAddressService.updateByPrimaryKeySelective(record);
        return updateByPrimaryKeySelective;
    }
}
