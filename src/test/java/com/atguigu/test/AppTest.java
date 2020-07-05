package com.atguigu.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.domin.User;
import com.atguigu.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private UserService userService;

    @Autowired
    DataSource dataSource;

    @Test
    public void testUser(){
        List<User> users = userService.findAll();
        for (User user : users) {
//            System.out.println(user);
            System.out.println(user + "user");
        }
    }

    @Test
    public void test1() throws SQLException {

        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
