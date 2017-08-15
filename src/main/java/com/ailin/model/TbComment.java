package com.ailin.model;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by Administrator on 2017/8/4.
 */

public class TbComment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Date createTime;

    private Date lastUpdate;

    private Byte visibility;

    private String content;

    private Integer consumerId;

    private Integer productorId;

    private Integer goodsId;

    private Integer commentedId;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public Integer getProductorId() {
        return productorId;
    }

    public void setProductorId(Integer productorId) {
        this.productorId = productorId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCommentedId() {
        return commentedId;
    }

    public void setCommentedId(Integer commentedId) {
        this.commentedId = commentedId;
    }
}
