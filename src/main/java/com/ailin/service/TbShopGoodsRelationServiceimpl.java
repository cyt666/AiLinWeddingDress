package com.ailin.service;

import com.ailin.dao.TbShopGoodsRelationDao;
import com.ailin.model.TbShopGoodsRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/8/18.
 */
@Service
public class TbShopGoodsRelationServiceimpl implements TbShopGoodsRelationService {
    @Autowired
    private TbShopGoodsRelationDao tbShopGoodsRelationDao;

    public TbShopGoodsRelation selectId(HashMap<Object, Object> map) {

        TbShopGoodsRelation selectId = tbShopGoodsRelationDao.selectId(map);
        return selectId;
    }
}
