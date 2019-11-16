package com.niit.meituan.dao;

import com.niit.meituan.model.UserRedbag;
import java.util.List;

public interface UserRedbagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRedbag record);

    UserRedbag selectByPrimaryKey(Integer id);

    List<UserRedbag> selectAll();

    int updateByPrimaryKey(UserRedbag record);
}