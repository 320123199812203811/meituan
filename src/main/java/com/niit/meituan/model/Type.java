package com.niit.meituan.model;

public class Type {
    private Integer id;

    private String name;

    private String img;

    private Integer number;

    private Integer shopId;



    public Type(Integer id, String name, String img, Integer number, Integer shopId) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.number = number;
        this.shopId = shopId;
    }

    public Type() {
        super();
    }

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}