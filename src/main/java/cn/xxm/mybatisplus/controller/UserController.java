package cn.xxm.mybatisplus.controller;


import cn.xxm.mybatisplus.pojo.User;
import cn.xxm.mybatisplus.service.UserService;
import cn.xxm.mybatisplus.spring.aop.LoggerManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Xxm123
 * @since 2018-09-16
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getAll")
    @LoggerManage(description = "[查询user List列表]")
    public List<User> getAll(){
        return userService.selectList(null);
    }

    
    @GetMapping("/findOne/{id}")
    @LoggerManage(description = "[根据user Id  查询指定的User]")
    public User findOne(@PathVariable("id") String id){
        return userService.selectById(id);
    }
}

