package com.ailin.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/12.
 */
public class TbAddress {
    private Integer id;
    private Date createTime;
    private Date lastUpdate;
    private Byte visibility;
    private String province;
    private String city;
    private String district;
    private String street;
    private String post;
    private String detail;
    private Integer consumerId;
    private String consumerName;
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

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", post='" + post + '\'' +
                ", detail='" + detail + '\'' +
                ", consumerId=" + consumerId +
                ", consumerName='" + consumerName + '\'' +
                ", consumerPhone='" + consumerPhone + '\'' +
                '}';
    }
}
