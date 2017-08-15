package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbShopCar implements Serializable {
    /**
     * tb_shop_car.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Integer id;

    /**
     * tb_shop_car.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Date createTime;

    /**
     * tb_shop_car.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Date lastUpdate;

    /**
     * tb_shop_car.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Byte visibility;

    /**
     * tb_shop_car.consumer_id (消费者表主键)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Integer consumerId;

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
}