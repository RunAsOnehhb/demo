package com.restful.impl;

import com.restful.dao.UserDao;
import com.restful.entity.User;
import com.restful.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getOne(Long id) {
        return userDao.selectById(id);
    }

    @Override
    public User findByNameAndAge(String name, Integer age) {
        return userDao.selectOne(new QueryWrapper<User>().eq("name",name).eq("age",age));
    }

    @Override
    public int deleteOne(Long id){
        return userDao.deleteById(id);
    }

    @Override
    public int insertOne(User user){
        return userDao.insert(user);
    }

    @Override
    public int updateOne(User user){
        return userDao.updateById(user);
    }
}
