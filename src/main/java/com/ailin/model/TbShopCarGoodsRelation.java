package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbShopCarGoodsRelation implements Serializable {

    private Integer id;

    private Date createTime;

    private Date lastUpdate;

    private Byte visibility;

    private Integer shopCarId;

    private Integer goodsId;

    private String size;

    private Integer count;

    private Byte status;

    // private TbShopGoodsRelation shopGoodsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // public TbShopGoodsRelation getShopGoodsList() {
    // return shopGoodsList;
    // }
    //
    // public void setShopGoodsList(TbShopGoodsRelation shopGoodsList) {
    // this.shopGoodsList = shopGoodsList;
    // }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Byte getVisibility() {
        return visibility;
    }

    public void setVisibility(Byte visibility) {
        this.visibility = visibility;
    }

    public Integer getShopCarId() {
        return shopCarId;
    }

    public void setShopCarId(Integer shopCarId) {
        this.shopCarId = shopCarId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TbShopCarGoodsRelation [id=" + id + ", createTime="
                + createTime + ", lastUpdate=" + lastUpdate + ", visibility="
                + visibility + ", shopCarId=" + shopCarId + ", goodsId="
                + goodsId + ", size=" + size + ", count=" + count + ", status="
                + status + "]";
    }

}