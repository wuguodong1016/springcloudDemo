package com.wugd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
// 激活Eureka中的DiscoveryClient实现(自动化配置,创建DiscoveryClient接口针对Eureka客户端的EurekaDiscoveryClient实例)
@SpringBootApplication
@ComponentScan(value = "com.wugd.springcloud")
public class SpringcloudUserServiceMasterApplication {

    public static void main(String[] args) {
    	
        SpringApplication.run(SpringcloudUserServiceMasterApplication.class, args);
    }
}

