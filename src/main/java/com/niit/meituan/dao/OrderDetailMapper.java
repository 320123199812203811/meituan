package com.niit.meituan.dao;

import com.niit.meituan.model.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer id);

    List<OrderDetail> selectAll();

    int updateByPrimaryKey(OrderDetail record);
}