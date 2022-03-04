package com.sjpddd.EpidemicFlow.service;

import com.sjpddd.EpidemicFlow.bean.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    User login (String account, String password);

    void register (String name,String password,String account);
}
