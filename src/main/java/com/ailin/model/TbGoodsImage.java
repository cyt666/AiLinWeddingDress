package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/17.
 */
public class TbGoodsImage implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Date createTime;

    private Date lastUpdate;

    private Byte visibility;

    private Integer goodsId;

    private String url;

    private Integer position;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "TbGoodsImage [id=" + id + ", createTime=" + createTime
                + ", lastUpdate=" + lastUpdate + ", visibility=" + visibility
                + ", goodsId=" + goodsId + ", url=" + url + ", position="
                + position + "]";
    }

}
