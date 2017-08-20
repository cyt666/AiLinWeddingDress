package com.ailin.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/17.
 */
public class TbOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Date createTime;

    private Date lastUpdate;

    private Byte visibility;

    private String orderNumber;

    private Integer consumerId;

    private Integer addressId;

    private Byte payWay;

    private String transferConpany;

    private String transferTime;

    private Integer couponId;

    private BigDecimal price;

    private Date transferBegin;

    private Date transferEnd;

    private Byte status;

    private String remark;

    private TbOrderGoodsRelation tbOrderGoodsRelation;

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

    public TbOrderGoodsRelation getTbOrderGoodsRelation() {
        return tbOrderGoodsRelation;
    }

    public void setTbOrderGoodsRelation(
            TbOrderGoodsRelation tbOrderGoodsRelation) {
        this.tbOrderGoodsRelation = tbOrderGoodsRelation;
    }

    @Override
    public String toString() {
        return "TbOrder [id=" + id + ", createTime=" + createTime
                + ", lastUpdate=" + lastUpdate + ", visibility=" + visibility
                + ", orderNumber=" + orderNumber + ", consumerId=" + consumerId
                + ", addressId=" + addressId + ", payWay=" + payWay
                + ", transferConpany=" + transferConpany + ", transferTime="
                + transferTime + ", couponId=" + couponId + ", price=" + price
                + ", transferBegin=" + transferBegin + ", transferEnd="
                + transferEnd + ", status=" + status + ", remark=" + remark
                + ", tbOrderGoodsRelation=" + tbOrderGoodsRelation + "]";
    }

}