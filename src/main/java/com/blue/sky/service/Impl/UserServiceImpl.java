package com.blue.sky.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blue.sky.entity.User;
import com.blue.sky.mapper.UserMapper;
import com.blue.sky.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
