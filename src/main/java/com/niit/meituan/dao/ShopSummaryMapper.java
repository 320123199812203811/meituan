package com.niit.meituan.dao;

import com.niit.meituan.model.ShopSummary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShopSummaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopSummary record);

    ShopSummary selectByPrimaryKey(Integer id);

    List<ShopSummary> selectAll();

    int updateByPrimaryKey(ShopSummary record);
}