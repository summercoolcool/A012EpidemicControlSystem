package com.sjpddd.EpidemicFlow.dao;

import com.sjpddd.EpidemicFlow.bean.User;
import org.apache.ibatis.annotations.Param;


public interface UserDao {
    User login (@Param("account") String account, @Param("password") String password);

    void register (@Param("name") String name,@Param("password") String password,@Param("account") String account);
}
