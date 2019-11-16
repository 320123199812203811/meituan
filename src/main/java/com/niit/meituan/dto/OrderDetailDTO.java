package com.niit.meituan.dto;

import lombok.Data;

@Data
public class OrderDetailDTO {
    private Integer id;
    private Integer orderId;
    private Integer productId;
    private String productQuantity;
    private Double productPrice;
    private Integer isGood;

    // 商品的名称
    private  String productName;
}
