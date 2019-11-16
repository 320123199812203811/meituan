package com.niit.meituan.model;

import lombok.Data;

@Data
public class UserAddress {
    private Integer id;

    private String userId;

    private String contactName;

    private String phone;

    private String address;

    private String addressDetail;

    private Integer gender;
}