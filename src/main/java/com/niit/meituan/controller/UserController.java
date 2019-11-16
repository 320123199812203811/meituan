package com.niit.meituan.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public Map<String,Object> login(){

        Map<String,Object> result = new HashMap<>();

        result.put("code",20000);
        result.put("token","admin-token");
        return result;
    }
}
