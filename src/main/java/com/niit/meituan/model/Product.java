package com.niit.meituan.model;

import lombok.Data;

@Data
public class Product {
    private String id;

    private String name;

    private String img;

    private String desc;

    private Double price1;

    private Double price2;

    private Double discount;

    private String shopimg;

    private String shopname;

    private  int    shopid;
}