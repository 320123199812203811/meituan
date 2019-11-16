package com.niit.meituan.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer id;

    private String orderNo;

    private Integer userId;

    private Integer shopId;

    private Integer quantity;

    private Double amount;

    private Integer orderState;

    private Date orderTime;

    private Double lastModify;

}