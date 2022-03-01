package com.sjpddd.EpidemicFlow.service;

import com.sjpddd.EpidemicFlow.dao.LoginDao;
import com.sjpddd.EpidemicFlow.entity.Login;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginDao loginDao;

    @Override
    public Login get(Login login) {
        // 通过Mapper的select方法查询用户
        return loginDao.select(login);
    }
}