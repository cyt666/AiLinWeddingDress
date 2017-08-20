package com.ailin.dao;

import com.ailin.model.TbOrder;
import com.ailin.model.pojo;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
public class TbOrderDaoimpl extends SqlSessionDaoSupport implements TbOrderDao{

    public int deleteByPrimaryKey(Integer id) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int insert(TbOrder record) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int insertSelective(TbOrder record) {
        // TODO Auto-generated method stub
        return 0;
    }

    public TbOrder selectByPrimaryKey(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    public int updateByPrimaryKeySelective(TbOrder record) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int updateByPrimaryKey(TbOrder record) {
        // TODO Auto-generated method stub
        return 0;
    }

    public List<pojo> selectOrderAll(Integer consumerId) {
        return this.getSqlSession().selectList("selectOrderAll", consumerId);
    }
}
