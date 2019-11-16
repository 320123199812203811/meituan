package com.niit.meituan.service.impl;

import com.niit.meituan.dao.TypeMapper;
import com.niit.meituan.dto.TypeFoodsDTO;
import com.niit.meituan.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService  implements ITypeService {

    @Autowired
    TypeMapper dao;

    @Override
    public List<TypeFoodsDTO> getType(Integer shopId) {
        return dao.getType(shopId);
    }
}
