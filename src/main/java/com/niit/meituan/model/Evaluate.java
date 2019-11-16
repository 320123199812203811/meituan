package com.niit.meituan.model;

import lombok.Data;

import java.util.Date;
@Data
public class Evaluate {
    private Integer id;

    private Integer userId;

    private Integer orderId;

    private Date evaluateTime;

    private Double rate;

    private String desc;

    private String imgs;

}