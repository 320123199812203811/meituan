package com.niit.meituan.dto;

import com.niit.meituan.model.Product;
import lombok.Data;

import java.util.List;

@Data
public class ShopDTO {
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

    private Integer sales;

    private Double  rate;

    private Double average;

    List<Product>  product;
}