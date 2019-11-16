package com.niit.meituan.dao;

import com.niit.meituan.model.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Activity record);

    Activity selectByPrimaryKey(Integer id);

    List<Activity> selectAll();

    int updateByPrimaryKey(Activity record);
}