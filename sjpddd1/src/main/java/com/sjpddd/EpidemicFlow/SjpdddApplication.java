package com.sjpddd.EpidemicFlow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sjpddd.EpidemicFlow.dao")
public class SjpdddApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjpdddApplication.class, args);
    }
}
