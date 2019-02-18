package com.wugd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCircuitBreaker //启动断路器支持
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudH5RibbonHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudH5RibbonHystrixApplication.class,args);
    }
}
