package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbGoodsImage implements Serializable {
    @Override
    public String toString() {
        return "TbGoodsImage{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", goodsId=" + goodsId +
                ", url='" + url + '\'' +
                ", position=" + position +
                '}';
    }

    /**
     * tb_goods_image.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer id;

    /**
     * tb_goods_image.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date createTime;

    /**
     * tb_goods_image.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date lastUpdate;

    /**
     * tb_goods_image.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Byte visibility;

    /**
     * tb_goods_image.goods_id (商品表主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer goodsId;

    /**
     * tb_goods_image.url (图片链接)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private String url;

    /**
     * tb_goods_image.position (在轮播图中的位置)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer position;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}