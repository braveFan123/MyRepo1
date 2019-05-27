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
    public String userLogin(Integer id, String password) {
        User user = userDao.queryById(id);
        System.out.println(user);
        if (user == null) {
            return "UserLogin";
        } else if (user.getId().equals(id) && user.getPassword().equals(password)) {
            return "UserCenter";
        } else {
            return "UserLogin";
        }
    }
}
