package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbGoodsSize implements Serializable {
    /**
     * tb_goods_size.id
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer id;

    /**
     * tb_goods_size.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date createTime;

    /**
     * tb_goods_size.last_update (最后更新)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date lastUpdate;

    /**
     * tb_goods_size.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Byte visibility;

    /**
     * tb_goods_size.goods_id
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer goodsId;

    /**
     * tb_goods_size.is_putaway
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Byte isPutaway;

    /**
     * tb_goods_size.size
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(Byte isPutaway) {
        this.isPutaway = isPutaway;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}