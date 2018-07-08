package com.ifreelight.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
        User user=new User();
        user.setName("admin");
        List<User> result=userService.findAll(user);
        Assert.assertNotNull(result);
    }

}
