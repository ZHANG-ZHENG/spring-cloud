package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer         //开启eureka服务
@SpringBootApplication 
public class RootEurekaApp {

    public static void main(String [] args) {
        SpringApplication.run(RootEurekaApp.class, args);
    }
}
