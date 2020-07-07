package com.restful.service;

import com.restful.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService  {

    User getOne(Long id);

    User findByNameAndAge(String name, Integer age);

    int deleteOne(Long id);

    int insertOne(User user);

    int updateOne(User user);

}