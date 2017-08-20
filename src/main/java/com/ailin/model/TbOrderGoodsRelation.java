package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbOrderGoodsRelation implements Serializable {
    /**
     * tb_order_goods_relation.id (主键)
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private Integer id;

    /**
     * tb_order_goods_relation.create_time (创建时间)
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private Date createTime;

    /**
     * tb_order_goods_relation.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private Date lastUpdate;

    /**
     * tb_order_goods_relation.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private Byte visibility;

    /**
     * tb_order_goods_relation.order_id (订单表主键做逻辑外键)
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private Integer orderId;

    /**
     * tb_order_goods_relation.goods_id (商品表主键做逻辑外键)
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private Integer goodsId;

    /**
     * tb_order_goods_relation.size
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private String size;

    /**
     * tb_order_goods_relation.count
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private Integer count;

    /**
     * tb_order_goods_relation.status
     * @ibatorgenerated 2017-08-13 15:14:16
     */
    private Byte status;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
}