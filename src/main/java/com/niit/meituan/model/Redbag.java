package com.niit.meituan.model;

import lombok.Data;

import java.util.Date;
@Data
public class Redbag {
    private Integer id;

    private String name;

    private String desc;

    private Double amount;

    private String condition;

    private String limit;

    private Date expireTime;
}