package com.wugd.springcloud.feign;

import com.wugd.springcloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "springcloud-provider-user-service")
public interface UserFeignClient {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    List<User> list();

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    User login(@RequestParam("name")  String name, @RequestParam("password") String password);

}