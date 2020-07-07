package com.restful;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.restful.entity.User;
import com.restful.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestfulApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        User user =new User();
        user.setAge(21);
        userService.updateOne(user);

    }

}
