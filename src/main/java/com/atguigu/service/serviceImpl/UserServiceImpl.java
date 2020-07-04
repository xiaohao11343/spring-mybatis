package com.atguigu.service.serviceImpl;

import com.atguigu.dao.UserDao;
import com.atguigu.domin.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Autowired
    RedisTemplate redisTemplate;

    @Transactional(readOnly = true,propagation = Propagation.REQUIRED)
    @Override
    public List<User> findAll() {
        String Key = "allUser";
        List<User> list = (List<User>)redisTemplate.boundValueOps(Key).get();
        if (list!=null){
            System.out.println("redis =" + list);
            return list;
        }
         list = userDao.findAll();
        if (list!=null&&list.size()>0){
            redisTemplate.boundValueOps(Key).set(list);
            System.out.println("数据库中的数据= " + list);
        }

        return list;
    }
}
