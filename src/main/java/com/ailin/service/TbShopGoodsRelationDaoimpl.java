package com.ailin.service;

import com.ailin.dao.TbShopGoodsRelationDao;
import com.ailin.model.TbGoods;
import com.ailin.model.TbShopGoodsRelation;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/12.
 */

public class TbShopGoodsRelationDaoimpl extends SqlSessionDaoSupport implements TbShopGoodsRelationDao {
    public List<TbShopGoodsRelation> selectAllGoods(Integer shopsId, String goodsName, Integer conditionId) {
        return this.getSqlSession().selectList("com.ailin.dao.TbShopGoodsRelationDao.selectAllGoods");
    }

    public List<TbShopGoodsRelation> selectGoodsById(Integer shopGoodsRelationId) {
        return this.getSqlSession().selectList("com.ailin.dao.TbShopGoodsRelationDao.selectGoodsById",shopGoodsRelationId);
    }

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

}
