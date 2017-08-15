package com.ailin.model;
import java.io.Serializable;
import java.util.Date;
/**
 * Created by Administrator on 2017/8/4.
 */
public class TbAddress implements Serializable {
    /**
     * tb_address.id (主键)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer id;

    /**
     * tb_address.create_time (创建时间)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Date createTime;

    /**
     * tb_address.last_update (最后更新)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Date lastUpdate;

    /**
     * tb_address.visibility (逻辑删除)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Byte visibility;

    /**
     * tb_address.province (省份)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private String province;

    /**
     * tb_address.city (城市)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private String city;

    /**
     * tb_address.district (区县)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private String district;

    /**
     * tb_address.street (街道)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private String street;

    /**
     * tb_address.post (邮编)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private String post;

    /**
     * tb_address.detail (详细地址)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private String detail;

    /**
     * tb_address.consumer_id (消费者表的逻辑外键)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private Integer consumerId;

    /**
     * tb_address.consumer_name (收货人姓名，未必会是注册用户的真实姓名)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private String consumerName;

    /**
     * tb_address.consumer_phone (收货人联系方式)
     *
     * @ibatorgenerated 2017-08-04 18:18:01
     */
    private String consumerPhone;

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerPhone() {
        return consumerPhone;
    }

    public void setConsumerPhone(String consumerPhone) {
        this.consumerPhone = consumerPhone;
    }

}
