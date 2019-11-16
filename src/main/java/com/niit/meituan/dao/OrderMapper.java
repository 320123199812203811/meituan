package com.niit.meituan.dao;

import com.niit.meituan.dto.OrderDTO;
import com.niit.meituan.model.Order;
import com.niit.meituan.model.ShopSummary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    Order selectByPrimaryKey(Integer id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);

    List<OrderDTO> getOrders(@Param("orderSate") Integer orderState,
                             @Param("userId") Integer UserId);

    List<ShopSummary> getShopRate();
    List<ShopSummary> getShopSales();
    List<ShopSummary> getShopAverage();
}