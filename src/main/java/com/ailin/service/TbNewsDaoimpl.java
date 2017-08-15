package com.ailin.service;

import com.ailin.dao.TbNewsDao;
import com.ailin.model.TbNews;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.ailin.dao.TbNewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 */
@Repository()
public class TbNewsDaoimpl extends SqlSessionDaoSupport implements TbNewsDao {
    public List<TbNews> selectAllNews() {
        return this.getSqlSession().selectList("selectAllNews");
    }

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
