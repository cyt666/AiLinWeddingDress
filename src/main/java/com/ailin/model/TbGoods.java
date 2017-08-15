package com.ailin.model;

/**
 * Created by Administrator on 2017/8/4.
 */
        import java.io.Serializable;
        import java.util.Date;
        import java.util.List;

public class TbGoods implements Serializable {
    @Override
    public String toString() {
        return "TbGoods{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", putawayTime=" + putawayTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", isPutaway=" + isPutaway +
                ", name='" + name + '\'' +
                ", hemline='" + hemline + '\'' +
                ", description='" + description + '\'' +
                ", style='" + style + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                ", saleCount=" + saleCount +
                ", weight=" + weight +
                ", status='" + status + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * tb_goods.id (主键)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer id;

    /**
     * tb_goods.create_time (创建时间)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date createTime;

    /**
     * tb_goods.putaway_time (上架日期)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date putawayTime;

    /**
     * tb_goods.last_update (最后更新时间)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Date lastUpdate;

    /**
     * tb_goods.visibility (逻辑删除)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Byte visibility;

    /**
     * tb_goods.is_putaway (是否上架)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Byte isPutaway;

    /**
     * tb_goods.name (商品名称)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String name;

    /**
     * tb_goods.hemline (裙摆样式)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String hemline;

    /**
     * tb_goods.description (商品描述)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String description;

    /**
     * tb_goods.style (商品款式)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String style;

    /**
     * tb_goods.color (颜色)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String color;

    /**
     * tb_goods.quantity (库存)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer quantity;

    /**
     * tb_goods.sale_count (销售量)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer saleCount;

    /**
     * tb_goods.weight (婚纱权重)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer weight;

    /**
     * tb_goods.status (订单商品状态)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private String status;

    /**
     * tb_goods.price (商品价格)
     * @ibatorgenerated 2017-08-04 18:18:04
     */
    private Integer price;

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

    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
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

    public Byte getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(Byte isPutaway) {
        this.isPutaway = isPutaway;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHemline() {
        return hemline;
    }

    public void setHemline(String hemline) {
        this.hemline = hemline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    }

