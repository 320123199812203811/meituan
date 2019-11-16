package com.niit.meituan.task;

import com.niit.meituan.model.ShopSummary;
import com.niit.meituan.service.IShopSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

    @Autowired
    IShopSummaryService shopSummaryService;

    @Scheduled(cron = "0 0/30 * * * *")
    public void updateShopSummary(){
        // 平均评分
        // 月总销售量
        // 人均
        // shopSummaryService.deletaAll();
        shopSummaryService.insert(new ShopSummary());
    }
}
