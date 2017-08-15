package com.ailin.model;
import java.io.Serializable;
import java.util.Date;
/**
 * Created by Administrator on 2017/8/4.
 */

public class TbConsumerGoodsRelation implements Serializable {
    /**
     * tb_consumer_goods_relation.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer id;

    /**
     * tb_consumer_goods_relation.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date createTime;

    /**
     * tb_consumer_goods_relation.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date lastUpdate;

    /**
     * tb_consumer_goods_relation.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Byte visibility;

    /**
     * tb_consumer_goods_relation.consumer_id (消费者表主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer consumerId;

    /**
     * tb_consumer_goods_relation.goods_id (商品表主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer goodsId;

    /**
     * tb_consumer_goods_relation.size (商品大小)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private String size;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
