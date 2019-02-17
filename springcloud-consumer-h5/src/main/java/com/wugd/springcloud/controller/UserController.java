package com.wugd.springcloud.controller;

import com.wugd.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("user/get/{id}")
    public User get(@PathVariable Long id){

        return this.restTemplate.getForObject("http://127.0.0.1:9996/get/{1}",User.class,id);
    }

    @GetMapping("user/list")
    public User get(){

        return this.restTemplate.getForObject("http://127.0.0.1:9996/list",User.class);
    }

}
