package com.ailin.service;

import com.ailin.model.TbAddress;

/**
 * Created by Administrator on 2017/8/20.
 */

public interface TbAddressService {

    public int deleteByPrimaryKey(Integer id);

    public int insertSelective(TbAddress record);

    public int updateByPrimaryKeySelective(TbAddress record);

}
