package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbHistory implements Serializable {

    /**
     * tb_history.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer id;

    /**
     * tb_history.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date createTime;

    /**
     * tb_history.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date lastUpdate;

    /**
     * tb_history.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Byte visibility;

    /**
     * tb_history.consumer_id (消费者表主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer consumerId;

    /**
     * tb_history.goods_id (商品表主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer goodsId;

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}