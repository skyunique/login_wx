package com.blue.sky.controller;

import com.blue.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    //查询全部
    @GetMapping("/list")
    public Object list(){
        System.out.println("查询成功");
        return userService.list();
    }

    @GetMapping("/del")
    public void del(){
        System.out.println("删除成功");

    }
}
