package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbManager implements Serializable {
    /**
     * tb_manager.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer id;

    /**
     * tb_manager.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date createTime;

    /**
     * tb_manager.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date lastUpdate;

    /**
     * tb_manager.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Byte visibility;

    /**
     * tb_manager.user_name (管理员名)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String userName;

    /**
     * tb_manager.password (管理员密码)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String password;

    /**
     * tb_manager.salt (盐值)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String salt;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}