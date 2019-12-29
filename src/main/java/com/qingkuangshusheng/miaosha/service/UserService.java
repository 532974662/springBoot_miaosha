package com.qingkuangshusheng.miaosha.service;

import com.qingkuangshusheng.miaosha.dao.UserDao;
import com.qingkuangshusheng.miaosha.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getById(int id){
        User user = userDao.getById(id);
        return user;
    }
}
