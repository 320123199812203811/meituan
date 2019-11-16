package com.niit.meituan.dao;

import com.niit.meituan.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProductMapper {
    int deleteByPrimaryKey(String id);

    int insert(Product record);

    Product selectByPrimaryKey(String id);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);
}