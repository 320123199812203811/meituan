package com.niit.meituan.dao;

import com.niit.meituan.model.UserAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAddress record);

    UserAddress selectByPrimaryKey(Integer id);

    List<UserAddress> selectAll();

    int updateByPrimaryKey(UserAddress record);
}