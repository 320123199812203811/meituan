package com.niit.meituan.model;

import lombok.Data;

@Data
public class Shop {
    private Integer id;

    private String name;

    private String address;

    private String desc;

    private String img;

    private String ad;

    private String category;

    private Double mindisprice;

    private Double deliveryprice1;

    private Double deliveryprice2;

    private Integer ismeituan;
}