package com.niit.meituan.model;

import lombok.Data;

import java.util.Date;
@Data
public class UserLikes {
    private Integer id;

    private Integer userId;

    private Integer shopId;

    private Date likeTime;
}