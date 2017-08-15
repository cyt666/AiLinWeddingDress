package com.ailin.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbOrder implements Serializable {
    /**
     * tb_order.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer id;

    /**
     * tb_order.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Date createTime;

    /**
     * tb_order.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Date lastUpdate;

    /**
     * tb_order.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Byte visibility;

    /**
     * tb_order.order_number (订单编号)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String orderNumber;

    /**
     * tb_order.consumer_id (消费者表主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer consumerId;

    /**
     * tb_order.address_id (订单地址主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer addressId;

    /**
     * tb_order.pay_way (付款方式)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Byte payWay;

    /**
     * tb_order.transfer_conpany (配送方式)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String transferConpany;

    /**
     * tb_order.transfer_time (用户期望的送货时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String transferTime;

    /**
     * tb_order.coupon_id (优惠券表主键做逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer couponId;

    /**
     * tb_order.price (订单的价格)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private BigDecimal price;

    /**
     * tb_order.transfer_begin (配送开始时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Date transferBegin;

    /**
     * tb_order.transfer_end (配送结束时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Date transferEnd;

    /**
     * tb_order.status (订单状态)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Byte status;

    /**
     * tb_order.remark (消费者的留言)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String remark;

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

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Byte getPayWay() {
        return payWay;
    }

    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    public String getTransferConpany() {
        return transferConpany;
    }

    public void setTransferConpany(String transferConpany) {
        this.transferConpany = transferConpany;
    }

    public String getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getTransferBegin() {
        return transferBegin;
    }

    public void setTransferBegin(Date transferBegin) {
        this.transferBegin = transferBegin;
    }

    public Date getTransferEnd() {
        return transferEnd;
    }

    public void setTransferEnd(Date transferEnd) {
        this.transferEnd = transferEnd;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}