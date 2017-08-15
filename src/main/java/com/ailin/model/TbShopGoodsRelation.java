package com.ailin.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TbShopGoodsRelation implements Serializable {

    private TbShop shop;
    private TbGoods goods;
    private List<TbGoodsImage> goodsImageList;

    @Override
    public String toString() {
        return "TbShopGoodsRelation{" +
                "shop=" + shop +
                ", goods=" + goods +
                ", goodsImageList=" + goodsImageList +
                ", id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", shopId=" + shopId +
                ", goodsId=" + goodsId +
                ", saleCount=" + saleCount +
                ", quantity=" + quantity +
                '}';
    }

    public List<TbGoodsImage> getGoodsImageList() {
        return goodsImageList;
    }

    public void setGoodsImageList(List<TbGoodsImage> goodsImageList) {
        this.goodsImageList = goodsImageList;
    }

    public TbGoods getGoods() {
        return goods;
    }

    public void setGoods(TbGoods goods) {
        this.goods = goods;
    }



    public TbShop getShop() {
        return shop;
    }

    public void setShop(TbShop shop) {
        this.shop = shop;
    }



    /**
     * tb_shop_goods_relation.id
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer id;

    /**
     * tb_shop_goods_relation.create_time
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Date createTime;

    /**
     * tb_shop_goods_relation.last_update
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Date lastUpdate;

    /**
     * tb_shop_goods_relation.visibility
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Byte visibility;

    /**
     * tb_shop_goods_relation.shop_id
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer shopId;

    /**
     * tb_shop_goods_relation.goods_id
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer goodsId;

    /**
     * tb_shop_goods_relation.sale_count
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer saleCount;

    /**
     * tb_shop_goods_relation.quantity (库存)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer quantity;

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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}