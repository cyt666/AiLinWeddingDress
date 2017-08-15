package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbLoginTicket implements Serializable {
    /**
     * tb_login_ticket.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer id;

    /**
     * tb_login_ticket.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date createTime;

    /**
     * tb_login_ticket.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date lastUpdate;

    /**
     * tb_login_ticket.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Byte visibility;

    /**
     * tb_login_ticket.consumer_id (消费者表主键做逻辑外键，与productor_id字段互斥)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer consumerId;

    /**
     * tb_login_ticket.productor_id (管理者表主键做逻辑外键，与consumer_id互斥)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer productorId;

    /**
     * tb_login_ticket.manager_id (consumer_id,productor_id互斥)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Integer managerId;

    /**
     * tb_login_ticket.expired (过期时间)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Date expired;

    /**
     * tb_login_ticket.ticket (用户登录凭据(MD5加密))
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private String ticket;

    /**
     * tb_login_ticket.status (ticket状态)
     * @ibatorgenerated 2017-08-04 18:18:03
     */
    private Byte status;

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

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}