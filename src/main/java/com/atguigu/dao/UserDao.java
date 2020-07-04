package com.atguigu.dao;

import com.atguigu.domin.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface UserDao{
    public List<User> findAll();
}