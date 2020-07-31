package com.blue.sky.controller;

import com.blue.sky.entity.User;
import com.blue.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public boolean del(Integer id){
        System.out.println("删除成功");
        return userService.removeById(id);
    }

    @GetMapping("/byid")
    public Object byid(Integer id ){
        System.out.println("查询成功");
        return userService.getById(id);
    }

    @PostMapping("/update")
    public boolean update(@RequestBody User user){
        System.out.println("修改成功");
        return userService.updateById(user);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody User user){
        System.out.println("添加成功");
        return userService.save(user);
    }
}
