package com.ailin.dao;

import com.ailin.model.TbAddress;

import java.util.List;

/**
 * Created by Administrator on 2017/8/12.
 */
public interface TbAddressDao {


    int deleteByPrimaryKey(Integer id);

    int insertSelective(TbAddress record);

    int updateByPrimaryKeySelective(TbAddress record);


}
