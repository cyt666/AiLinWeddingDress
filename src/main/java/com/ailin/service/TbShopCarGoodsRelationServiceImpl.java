package com.ailin.service;

import com.ailin.dao.TbShopCarGoodsRelationDao;
import com.ailin.model.TbShopCarGoodsRelation;
import com.ailin.model.TbShopGoodsRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TbShopCarGoodsRelationServiceImpl implements TbShopCarGoodsRelationService {

@Autowired
private TbShopCarGoodsRelationDao tbShopCarGoodsRelationDao;

    public int insert(TbShopCarGoodsRelation record) {
        int insert = tbShopCarGoodsRelationDao.insert(record);
        return insert;
    }

    public int deleteByPrimaryKey(TbShopCarGoodsRelation record) {
        int deleteByPrimaryKey = tbShopCarGoodsRelationDao.deleteByPrimaryKey(record);
        return deleteByPrimaryKey;
    }

    public int selectByshopCarIdAndGoodsId(HashMap<Object, Object> map) {
        int selectByshopCarIdAndGoodsId = tbShopCarGoodsRelationDao.selectByshopCarIdAndGoodsId(map);
        return selectByshopCarIdAndGoodsId;
    }
}
