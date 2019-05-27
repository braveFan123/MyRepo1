package com.mrfan.dao;

import com.mrfan.model.User;

public interface UserDao {
    User queryById(Integer id);
}
