package com.ailin.dao;

import com.ailin.model.TbAddress;
import com.ailin.model.TbConsumer;

import java.util.List;

/**
 * Created by Administrator on 2017/8/12.
 */
public interface TbConsumerDao {

    int updateByPrimaryKeySelective(TbConsumer record);

    List<TbAddress> selectAddressAndConsumer(Integer consumerId);

    TbConsumer login(TbConsumer tbconsumer);

    List<TbConsumer> selectAll();
}
