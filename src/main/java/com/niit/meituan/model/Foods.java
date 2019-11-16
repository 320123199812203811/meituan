package com.niit.meituan.model;

public class Foods {
    private Integer id;

    private Integer typeId;

    private Integer quantity;

    private String name;

    private Double price;

    private String img;

    public Foods(Integer id, Integer typeId, Integer quantity, String name, Double price, String img) {
        this.id = id;
        this.typeId = typeId;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.img = img;
    }

    public Foods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}