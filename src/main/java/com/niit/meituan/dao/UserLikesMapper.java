package com.niit.meituan.dao;

import com.niit.meituan.model.UserLikes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserLikesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLikes record);

    UserLikes selectByPrimaryKey(Integer id);

    List<UserLikes> selectAll();

    int updateByPrimaryKey(UserLikes record);
}