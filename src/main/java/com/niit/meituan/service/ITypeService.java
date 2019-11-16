package com.niit.meituan.service;

import com.niit.meituan.dto.TypeFoodsDTO;

import java.util.List;

public interface ITypeService {
    List<TypeFoodsDTO> getType(Integer shopId);
}
