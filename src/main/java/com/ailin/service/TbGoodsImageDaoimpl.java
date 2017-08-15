package com.ailin.service;

import com.ailin.dao.TbGoodsImageDao;
import com.ailin.model.TbGoodsImage;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
@Repository()
public class TbGoodsImageDaoimpl extends SqlSessionDaoSupport implements TbGoodsImageDao {

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
