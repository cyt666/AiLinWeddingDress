package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by junlei.L on 2017/8/4.
 * 模型示例
 */
public class User implements Serializable {
    public Integer id;
    public String name;
    public Date birthday;
    public Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", money=" + money +
                '}';
    }
}
