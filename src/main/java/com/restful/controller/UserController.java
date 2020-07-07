package com.restful.controller;


import com.restful.entity.User;
import com.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 */
@RestController
@RequestMapping("/api")
public class UserController {

@Autowired
private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getOne(@RequestParam(value = "id" , required = true)long id){
        return userService.getOne(id);
    }

//    @GetMapping(value = "/getUser",params = {"name","age"})
//    public User findByNameAndAge(String name,Integer age){
//        return userService.findByNameAndAge(name,age);
//    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public int deleteOne(@RequestParam(value = "id" , required = true)long id){
        return userService.deleteOne(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int insertOne(User user){
        return userService.insertOne(user);
    }

    @RequestMapping(value = "/user",method =RequestMethod.PUT )
    public int updateOne(User user){
        return userService.updateOne(user);
    }
}