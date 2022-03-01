package com.sjpddd.EpidemicFlow.dao;

import com.sjpddd.EpidemicFlow.entity.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {

    Login select(Login login);
}
