package com.mrfan.service.Impl;

import com.mrfan.dao.UserDao;
import com.mrfan.model.User;
import com.mrfan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User queryById(Integer id) {
        return userDao.queryById(id);
    }
}
