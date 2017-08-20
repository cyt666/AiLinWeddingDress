package com.ailin.model;
import java.util.Date;
/**
 * Created by Administrator on 2017/8/20.
 */
public class Shop {
    @Override
    public String toString() {
        return "TbShop{" +
                "id=" + id +
                ", visibility=" + visibility +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", saleCount=" + saleCount +
                ", telephone='" + telephone + '\'' +
                ", adress='" + adress + '\'' +
                ", managerId=" + managerId +
                '}';
    }

    /**
     * tb_shop.id
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer id;

    /**
     * tb_shop.visibility
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Byte visibility;

    /**
     * tb_shop.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Date createTime;

    /**
     * tb_shop.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Date lastUpdate;

    /**
     * tb_shop.image (店铺头像)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String image;

    /**
     * tb_shop.name (店铺名称)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String name;

    /**
     * tb_shop.sale_count (店铺销量)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer saleCount;

    /**
     * tb_shop.telephone (店铺电话)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String telephone;

    /**
     * tb_shop.adress (店铺地址)
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private String adress;

    /**
     * tb_shop.manager_id
     * @ibatorgenerated 2017-08-04 18:18:02
     */
    private Integer managerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getVisibility() {
        return visibility;
    }

    public void setVisibility(Byte visibility) {
        this.visibility = visibility;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}
