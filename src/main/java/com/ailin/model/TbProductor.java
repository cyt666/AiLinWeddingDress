package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbProductor implements Serializable {
    /**
     * tb_productor.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Integer id;

    /**
     * tb_productor.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Date createTime;

    /**
     * tb_productor.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Date lastUpdate;

    /**
     * tb_productor.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private Byte visibility;

    /**
     * tb_productor.user_name (管理员名)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private String userName;

    /**
     * tb_productor.password (管理员密码)
     * @ibatorgenerated 2017-08-04 18:18:05
     */
    private String password;

    /**
     * tb_productor.salt (盐值)
     * @ibatorgenerated 2017-08-04 18:18:05
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