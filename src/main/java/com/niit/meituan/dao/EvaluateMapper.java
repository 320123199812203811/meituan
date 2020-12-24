package com.niit.meituan.dao;

import com.niit.meituan.model.Evaluate;
import java.util.List;

public interface EvaluateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Evaluate record);

    Evaluate selectByPrimaryKey(Integer id);

    List<Evaluate> selectAll();

    int updateByPrimaryKey(Evaluate record);

    void test();
}