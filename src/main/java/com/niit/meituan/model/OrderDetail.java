package com.niit.meituan.model;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer id;

    private Integer orderId;

    private Integer productId;

    private String productQuantity;

    private Double productPrice;

    private Integer isGood;
}