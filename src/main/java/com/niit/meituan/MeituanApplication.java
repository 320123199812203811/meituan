package com.niit.meituan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // 开启spring 定时任务支持
@SpringBootApplication
@MapperScan("com.niit.meituan.dao")
public class MeituanApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeituanApplication.class, args);
    }

    String a ="helloworld";
}
