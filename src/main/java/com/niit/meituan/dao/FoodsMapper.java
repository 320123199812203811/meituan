package com.niit.meituan.dao;

import com.niit.meituan.model.Foods;

public interface FoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Foods record);

    int insertSelective(Foods record);

    Foods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);
}