package com.niit.meituan.model;

import lombok.Data;

@Data
public class ShopSummary {
    private Integer id;

    private Integer shopId;

    private Double rate;

    private Integer sales;

    private Double average;
}