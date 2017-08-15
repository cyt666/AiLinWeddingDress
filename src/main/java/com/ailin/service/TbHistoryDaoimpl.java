package com.ailin.service;
import com.ailin.dao.TbHistoryDao;
import com.ailin.model.TbGoods;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
@Repository()
public class TbHistoryDaoimpl  extends SqlSessionDaoSupport implements TbHistoryDao {
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
