package com.ailin.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TbShopCar implements Serializable {

    private Integer id;

    private Date createTime;

    private Date lastUpdate;

    private Byte visibility;
    private Integer consumerId;

    private List<TbShopCarGoodsRelation> goodsList;

    public List<TbShopCarGoodsRelation> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<TbShopCarGoodsRelation> goodsList) {
        this.goodsList = goodsList;
    }

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

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TbShopCar [id=" + id + ", createTime=" + createTime
                + ", lastUpdate=" + lastUpdate + ", visibility=" + visibility
                + ", consumerId=" + consumerId + ", goodsList=" + goodsList
                + "]";
    }

}