package com.ailin.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/17.
 */
public class pojo {
    // tb_order表里的数据
    private Integer orderId;
    private Integer consumerId;
    private Integer addressId;
    private Byte payWay;
    private String transferConpany;
    private String transferTime;
    private BigDecimal price;
    private Date transferBegin;
    private Date transferEnd;
    private Byte status;
    private String remark;

    // tb_order_goods_relation表里的数据
    private Integer orderGoodsRelationId;
    private Integer orderGoodsRelationgoodsId;
    private String size;
    private Integer count;
    // tb_shop_goods_relation表里的数据
    private Integer shopGoodsRelationId;
    private Integer shopGoodsRelationshopId;
    private Integer shopGoodsRelationgoodsId;
    // tb_shop表里的数据
    private Integer shopId;
    private String shopname;
    private String telephone;
    // tb_goods表里的数据
    private Integer goodsId;
    private String goodsname;
    private Integer goodsprice;
    // tb_goods_image表里的数据
    private Integer goodsImageId;
    private String url;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Integer getOrderGoodsRelationId() {
        return orderGoodsRelationId;
    }

    public void setOrderGoodsRelationId(Integer orderGoodsRelationId) {
        this.orderGoodsRelationId = orderGoodsRelationId;
    }

    public Integer getOrderGoodsRelationgoodsId() {
        return orderGoodsRelationgoodsId;
    }

    public void setOrderGoodsRelationgoodsId(Integer orderGoodsRelationgoodsId) {
        this.orderGoodsRelationgoodsId = orderGoodsRelationgoodsId;
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

    public Integer getShopGoodsRelationId() {
        return shopGoodsRelationId;
    }

    public void setShopGoodsRelationId(Integer shopGoodsRelationId) {
        this.shopGoodsRelationId = shopGoodsRelationId;
    }

    public Integer getShopGoodsRelationshopId() {
        return shopGoodsRelationshopId;
    }

    public void setShopGoodsRelationshopId(Integer shopGoodsRelationshopId) {
        this.shopGoodsRelationshopId = shopGoodsRelationshopId;
    }

    public Integer getShopGoodsRelationgoodsId() {
        return shopGoodsRelationgoodsId;
    }

    public void setShopGoodsRelationgoodsId(Integer shopGoodsRelationgoodsId) {
        this.shopGoodsRelationgoodsId = shopGoodsRelationgoodsId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShoptelephone() {
        return telephone;
    }

    public void settelephone(String shoptelephone) {
        this.telephone = shoptelephone;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Integer goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getGoodsImageId() {
        return goodsImageId;
    }

    public void setGoodsImageId(Integer goodsImageId) {
        this.goodsImageId = goodsImageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "pojo{" + "orderId=" + orderId + ", consumerId=" + consumerId
                + ", addressId=" + addressId + ", payWay=" + payWay
                + ", transferConpany='" + transferConpany + '\''
                + ", transferTime='" + transferTime + '\'' + ", price=" + price
                + ", transferBegin=" + transferBegin + ", transferEnd="
                + transferEnd + ", status=" + status + ", remark='" + remark
                + '\'' + ", orderGoodsRelationId=" + orderGoodsRelationId
                + ", orderGoodsRelationgoodsId=" + orderGoodsRelationgoodsId
                + ", size='" + size + '\'' + ", count=" + count
                + ", shopGoodsRelationId=" + shopGoodsRelationId
                + ", shopGoodsRelationshopId=" + shopGoodsRelationshopId
                + ", shopGoodsRelationgoodsId=" + shopGoodsRelationgoodsId
                + ", shopId=" + shopId + ", shopname='" + shopname + '\''
                + ", telephone='" + telephone + '\'' + ", goodsId=" + goodsId
                + ", goodsname='" + goodsname + '\'' + ", goodsprice="
                + goodsprice + ", goodsImageId=" + goodsImageId + ", url='"
                + url + '\'' + '}';
    }
}
