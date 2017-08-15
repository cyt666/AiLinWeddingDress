package com.ailin.service;

import com.ailin.dao.TbHomeRotationDao;
import com.ailin.model.TbHomeRotation;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 */
@Repository()
public class TbHomeRotationDaoimpl extends SqlSessionDaoSupport implements TbHomeRotationDao {
    public List<TbHomeRotation> selectAllHomeRotation() {
        return this.getSqlSession().selectList("selectAllHomeRotation");
    }

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
