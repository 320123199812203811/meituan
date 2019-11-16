package com.niit.meituan.service.impl;

import com.niit.meituan.dao.OrderMapper;
import com.niit.meituan.dto.OrderDTO;
import com.niit.meituan.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    OrderMapper dao;

    @Override
    public List<OrderDTO> getOrders(Integer orderState, Integer UserId) {
        return dao.getOrders(orderState,UserId);
    }
}
