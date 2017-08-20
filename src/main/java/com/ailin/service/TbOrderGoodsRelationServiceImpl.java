package com.ailin.service;

import com.ailin.dao.TbOrderGoodsRelationDao;
import com.ailin.model.TbOrder;
import com.ailin.model.TbOrderGoodsRelation;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/18.
 */
@Service
public class TbOrderGoodsRelationServiceImpl implements  TbOrderGoodsRelationService {
    private TbOrderGoodsRelationDao tbOrderGoodsRelationDao;
    public int deleteByPrimaryKey(TbOrderGoodsRelation record) {
        int delete = tbOrderGoodsRelationDao.deleteByPrimaryKey(record);
        return delete;
    }

    public int insert(TbOrderGoodsRelation record) {
        int insert = tbOrderGoodsRelationDao.insert(record);
        return insert;
    }

    public int updateByPrimaryKey(TbOrderGoodsRelation record) {
        int update = tbOrderGoodsRelationDao.updateByPrimaryKey(record);
        return update;
    }
}
