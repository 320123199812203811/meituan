package com.niit.meituan.service;

import com.niit.meituan.dto.OrderDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IOrderService {

    List<OrderDTO> getOrders(Integer orderState, Integer UserId);
}
