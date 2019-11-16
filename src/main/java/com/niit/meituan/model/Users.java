package com.niit.meituan.model;

import lombok.Data;

@Data
public class Users {
    private Integer id;

    private String openid;

    private String nickname;

    private String img;

    private String phone;

    private String gender;

}