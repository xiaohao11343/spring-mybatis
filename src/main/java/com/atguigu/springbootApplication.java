package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@MapperScan("com.atguigu.dao")
@SpringBootApplication
@EnableScheduling
public class springbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(springbootApplication.class, args);
    }
}