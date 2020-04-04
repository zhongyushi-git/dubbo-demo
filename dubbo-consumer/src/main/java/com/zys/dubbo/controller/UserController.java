package com.zys.dubbo.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.zys.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    //调用远程接口
    @Reference(loadbalance = "random")
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public String showName(){
        return userService.getName();
    }

}