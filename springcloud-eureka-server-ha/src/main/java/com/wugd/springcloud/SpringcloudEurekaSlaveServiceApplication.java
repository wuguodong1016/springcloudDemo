package com.wugd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaSlaveServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaSlaveServiceApplication.class,args);
    }
}
