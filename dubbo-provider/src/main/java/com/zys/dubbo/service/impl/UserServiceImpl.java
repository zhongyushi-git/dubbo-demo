package com.zys.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zys.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "success";
    }
}
