package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbHomeRotation implements Serializable {
    /**
     * tb_home_rotation.id
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer id;

    /**
     * tb_home_rotation.create_time
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date createTime;

    /**
     * tb_home_rotation.last_update
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date lastUpdate;

    /**
     * tb_home_rotation.visibility
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Byte visibility;

    /**
     * tb_home_rotation.goods_id
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer goodsId;

    /**
     * tb_home_rotation.position
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer position;

    /**
     * tb_home_rotation.url
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String url;
    private Integer shopId;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TbHomeRotation{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", goodsId=" + goodsId +
                ", position=" + position +
                ", url='" + url + '\'' +
                ", shopId=" + shopId +
                '}';
    }
}