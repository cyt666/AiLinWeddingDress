package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbMessage implements Serializable {
    /**
     * tb_message.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer id;

    /**
     * tb_message.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date createTime;

    /**
     * tb_message.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date lastUpdate;

    /**
     * tb_message.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Byte visibility;

    /**
     * tb_message.from_id (发送方的逻辑外键)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer fromId;

    /**
     * tb_message.to_id (接收方主键)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer toId;

    /**
     * tb_message.content (消息内容)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String content;

    /**
     * tb_message.type (消息类型，0为文本，1为图片)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Byte type;

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

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
}