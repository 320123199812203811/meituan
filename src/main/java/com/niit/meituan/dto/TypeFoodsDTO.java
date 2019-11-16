package com.niit.meituan.dto;

import com.niit.meituan.model.Foods;
import lombok.Data;

import java.util.List;

@Data
public class TypeFoodsDTO {
    private Integer id;

    private String name;

    private String img;

    private Integer number;

    private Integer shopId;

    List<Foods> foods;
}
