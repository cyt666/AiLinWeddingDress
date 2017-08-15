package com.ailin.model;
import java.io.Serializable;
import java.util.Date;
/**
 * Created by Administrator on 2017/8/4.
 */

public class TbCoupon implements Serializable {
    /**
     * tb_coupon.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Integer id;

    /**
     * tb_coupon.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Date createTime;

    /**
     * tb_coupon.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Date lastUpdate;

    /**
     * tb_coupon.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Byte visibility;

    /**
     * tb_coupon.target (消费金额)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Integer target;

    /**
     * tb_coupon.reduce (优惠金额)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Integer reduce;

    /**
     * tb_coupon.consumer_id (消费者表主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Integer consumerId;

    /**
     * tb_coupon.content (满减券内容)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private String content;

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

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public Integer getReduce() {
        return reduce;
    }

    public void setReduce(Integer reduce) {
        this.reduce = reduce;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}