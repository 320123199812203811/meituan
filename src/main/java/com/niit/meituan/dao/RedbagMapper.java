package com.niit.meituan.dao;

import com.niit.meituan.model.Redbag;
import java.util.List;

public interface RedbagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Redbag record);

    Redbag selectByPrimaryKey(Integer id);

    List<Redbag> selectAll();

    int updateByPrimaryKey(Redbag record);
}