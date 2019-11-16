package com.niit.meituan.service.impl;

import com.niit.meituan.dao.ShopMapper;
import com.niit.meituan.dto.ShopDTO;
import com.niit.meituan.model.Shop;
import com.niit.meituan.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService implements IShopService {

    /**
     *
     */
    @Autowired
    ShopMapper dao;

    @Override
    public List<Shop> getShops() {
        return dao.getShops();
    }

    @Override
    public int updateByPrimaryKey(Shop record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Shop record) {
        return dao.insert(record);
    }

    @Override
    public List<ShopDTO>  getSelect(){return dao.getSelect();}
}
