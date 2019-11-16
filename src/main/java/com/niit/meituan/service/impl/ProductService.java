package com.niit.meituan.service.impl;

import com.niit.meituan.dao.ProductMapper;
import com.niit.meituan.model.Product;
import com.niit.meituan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    ProductMapper dao;

    @Override
    public  List<Product> selectAll(){
        return dao.selectAll();
    }
}
