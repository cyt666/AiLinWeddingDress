package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/17.
 */
public class TbShopGoodsRelation implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Date createTime;

    private Date lastUpdate;

    private Byte visibility;

    private Integer shopId;

    private Integer goodsId;

    private Integer saleCount;

    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TbShopGoodsRelation [id=" + id + ", createTime=" + createTime
                + ", lastUpdate=" + lastUpdate + ", visibility=" + visibility
                + ", shopId=" + shopId + ", goodsId=" + goodsId
                + ", saleCount=" + saleCount + ", quantity=" + quantity + "]";
    }

}
