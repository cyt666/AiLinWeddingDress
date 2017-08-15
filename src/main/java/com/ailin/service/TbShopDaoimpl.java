package com.ailin.service;

import com.ailin.dao.TbGoodsDao;
import com.ailin.dao.TbShopDao;
import com.ailin.model.TbGoods;
import com.ailin.model.TbShop;
import com.ailin.model.TbShopGoodsRelation;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 */

public class TbShopDaoimpl extends SqlSessionDaoSupport implements TbShopDao {
    public List<TbShopGoodsRelation> selectShopByName(String shopName) {
        return this.getSqlSession().selectList("selectShopByName",shopName);
    }

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
