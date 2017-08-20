package com.ailin.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/17.
 */
public class ShopCarGoods implements Serializable {
    private Integer shopCarID;
    private Integer shopId;
    private String shopImage;
    private String shopName;
    private String goodsImage;
    private String size;
    private String count;
    private String goodsName;
    private String hemile;
    private String description;
    private String style;
    private String color;
    private String price;

    @Override
    public String toString() {
        return "ShopCarGoods{" +
                "shopCarID=" + shopCarID +
                ", shopId=" + shopId +
                ", shopImage='" + shopImage + '\'' +
                ", shopName='" + shopName + '\'' +
                ", goodsImage='" + goodsImage + '\'' +
                ", size='" + size + '\'' +
                ", count='" + count + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", hemile='" + hemile + '\'' +
                ", description='" + description + '\'' +
                ", style='" + style + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
