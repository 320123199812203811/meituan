package com.niit.meituan.dao;

import com.niit.meituan.dto.TypeFoodsDTO;
import com.niit.meituan.model.Foods;
import com.niit.meituan.model.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface TypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<TypeFoodsDTO> getType(@Param("shopId") Integer shopId);
}