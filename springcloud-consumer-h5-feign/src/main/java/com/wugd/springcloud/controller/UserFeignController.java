package com.wugd.springcloud.controller;

import com.wugd.springcloud.entity.User;
import com.wugd.springcloud.feign.UserFeignClient;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserFeignController {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserFeignController.class);

    @Autowired
    UserFeignClient userFeignClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping(value = "/str")
    public String getString(){

        return "hello word";
    }

    @GetMapping(value = "/list")
    public List<User> list(){

        return userFeignClient.list();
    }

    @GetMapping("/login")
    public User login(@RequestParam String name, @RequestParam String password){

        return userFeignClient.login(name,password);
    }

    /**
     * ribbon负载均衡测试方法
     * springcloud 将feign和ribbon以及eureka进行了集成
     */
    @GetMapping("/log-user-service-instance")
    public void loguserserviceinstance(){

        ServiceInstance serviceInstance=this.loadBalancerClient.choose("springcloud-provider-user-service");

        LOGGER.info("serviceInstance info ---> serviceId is  "+serviceInstance.getServiceId()+" host is "+serviceInstance.getHost()+"port is "+serviceInstance.getPort() );
    }
}
