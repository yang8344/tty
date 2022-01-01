package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    UserDao userDao;
    public List<User> saveList(List<User> list){
        userDao.saveAll(list);
        return list;
    }
}
