package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbNews implements Serializable {
    @Override
    public String toString() {
        return "TbNews{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", shopId=" + shopId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    /**
     * tb_news.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer id;

    /**
     * tb_news.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Date createTime;

    /**
     * tb_news.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Date lastUpdate;

    /**
     * tb_news.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Byte visibility;

    /**
     * tb_news.shop_id (管理员逻辑主键)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer shopId;

    /**
     * tb_news.title (标题)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String title;

    /**
     * tb_news.content (内容)
     * @ibatorgenerated 2017-08-04 18:18:02
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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}