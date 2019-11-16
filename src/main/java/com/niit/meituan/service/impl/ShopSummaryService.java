package com.niit.meituan.service.impl;

import com.niit.meituan.dao.OrderMapper;
import com.niit.meituan.dao.ShopSummaryMapper;
import com.niit.meituan.model.ShopSummary;
import com.niit.meituan.service.IShopSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopSummaryService implements IShopSummaryService {

    @Autowired
    ShopSummaryMapper  shopSummaryMapper;

    @Autowired
    OrderMapper   orderMapper;

    @Override
    public int insert(ShopSummary record) {

        List<ShopSummary> salesList = orderMapper.getShopSales();
        List<ShopSummary> rateList = orderMapper.getShopRate();
        List<ShopSummary> avgList = orderMapper.getShopAverage();

        for(int i=0;i<salesList.size();i++){
            ShopSummary summary = new ShopSummary();

            summary.setShopId(salesList.get(i).getShopId());
            summary.setSales(salesList.get(i).getSales());
            for(ShopSummary summary1: rateList){
                if(summary1.getShopId()==salesList.get(i).getShopId()){
                    summary.setRate(summary1.getRate());
                    break;
                }
            }
            for(ShopSummary summary2: avgList){
                if(summary2.getShopId()==salesList.get(i).getShopId()){
                    summary.setAverage(summary2.getAverage());
                    break;
                }
            }

            shopSummaryMapper.insert(summary);
        }

        return 0;
    }
}
