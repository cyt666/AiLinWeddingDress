package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbManagerLog implements Serializable {
    /**
     * tb_manager_log.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer id;

    /**
     * tb_manager_log.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Date createTime;

    /**
     * tb_manager_log.last_update (最后修改时间)
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Date lastUpdate;

    /**
     * tb_manager_log.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Byte visibility;

    /**
     * tb_manager_log.productor_id (管理员表的外键)
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer productorId;

    /**
     * tb_manager_log.content (操作内容)
     * @ibatorgenerated 2017-08-04 18:18:01
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

    public Integer getProductorId() {
        return productorId;
    }

    public void setProductorId(Integer productorId) {
        this.productorId = productorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}