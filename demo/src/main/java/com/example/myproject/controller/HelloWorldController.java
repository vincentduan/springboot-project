package com.example.myproject.controller;

import com.example.myproject.domain.User;
import com.example.myproject.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    UserService userService;

    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping("hello")
    public String index(){
        return "hello world";
    }

    @RequestMapping("getUsers")
    public List<User> getUsers(){
        User user = new User();
        user.setId("1");
        user.setName("vincent");
        user.setAge("25");
        List<User> userList = userService.getUserList();
        //userList.forEach(user1 -> System.out.println(user1));
        logger.info("getUsers=============info");
        logger.debug("getUsers==============debug");
        return userList;
    }
}
