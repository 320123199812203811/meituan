package com.niit.meituan.dao;

import com.niit.meituan.dto.ShopDTO;
import com.niit.meituan.model.Shop;
import com.niit.meituan.model.ShopSummary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    Shop selectByPrimaryKey(Integer id);

    List<Shop> selectAll();

    int updateByPrimaryKey(Shop record);

    List<Shop> getShops();

    List<ShopDTO> getSelect();
}