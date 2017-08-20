package com.ailin.service;

import java.util.List;

import com.ailin.dao.TbShopCarDao;
import com.ailin.model.ShopCarGoods;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ailin.model.TbShopCar;

import javax.annotation.Resource;

@Repository()
public class TbShopCarDaoimpl extends SqlSessionDaoSupport implements
        TbShopCarDao {
    // ɾ��
    public int deleteByPrimaryKey(Integer id) {

        return this.getSqlSession().delete("deleteByPrimaryKey", id);
    }

    // ����
    public int insert(TbShopCar record) {

        return this.getSqlSession().insert("insert", record);
    }

    // ����
    public TbShopCar selectByPrimaryKey(Integer id) {

        return (TbShopCar) this.getSqlSession().selectOne("selectByPrimaryKey",
                id);
    }

    // �޸�
    public int updateByPrimaryKey(TbShopCar record) {

        return this.getSqlSession().update("updateByPrimaryKey", record);
    }

    public List<TbShopCar> selectByShopCarId(Integer id) {
        return this.getSqlSession().selectList("selectByShopCarId", id);
    }

    public int selectByConsumerId(Integer consumerId) {

        return (Integer) this.getSqlSession().selectOne("selectByConsumerId",
                consumerId);
    }

    // 2
    public TbShopCar selectByGoodsId(Integer goodsId) {

        return (TbShopCar) this.getSqlSession().selectOne("selectByGoodsId",
                goodsId);
    }

    public List<ShopCarGoods> selectAllShopCarGoods(Integer id) {

        return this.getSqlSession().selectList("selectAllShopCarGoods", id);
    }
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
