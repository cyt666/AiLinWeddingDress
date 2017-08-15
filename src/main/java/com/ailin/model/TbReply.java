package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbReply implements Serializable {
    /**
     * tb_reply.id
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private Integer id;

    /**
     * tb_reply.create_time
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private Date createTime;

    /**
     * tb_reply.last_update
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private Date lastUpdate;

    /**
     * tb_reply.visibility
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private Byte visibility;

    /**
     * tb_reply.source_id (回复表保存对于评论的回复)
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private Integer sourceId;

    /**
     * tb_reply.reply
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private String reply;

    /**
     * tb_reply.from_id
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private Integer fromId;

    /**
     * tb_reply.to_id
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private Integer toId;

    /**
     * tb_reply.reply_id (回复表保存对评论的回复)
     * @ibatorgenerated 2017-08-04 18:18:00
     */
    private Integer replyId;

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

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
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

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }
}