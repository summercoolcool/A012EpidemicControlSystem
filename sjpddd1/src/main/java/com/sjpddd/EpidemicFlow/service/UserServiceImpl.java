package com.sjpddd.EpidemicFlow.service;

import com.sjpddd.EpidemicFlow.bean.User;
import com.sjpddd.EpidemicFlow.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;


    public User login(String account, String password) {
        return userDao.login(account, password);
    }


    public void register(String name, String password, String account) {
        userDao.register(name, password, account);
    }
}
