package com.niit.meituan.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private String shopName; // 商店名称
    private String shopImg;  // 商店图片
    private Integer id;
    private String orderNo;
    private Integer userId;
    private Integer shopId;
    private Integer quantity;
    private Double amount;
    private Integer orderState;
    private Date orderTime;
    private Double lastModify;
    // 一对多
    List<OrderDetailDTO> orderDetails;
}
