package com.niit.meituan.service;

import com.niit.meituan.dto.ShopDTO;
import com.niit.meituan.model.Shop;

import java.util.List;

public interface IShopService {

    List<Shop> getShops();

    int updateByPrimaryKey(Shop record);

    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    List<ShopDTO> getSelect();
}
