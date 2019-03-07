package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class RootConfigClientApp {

    public static void main(String [] args) {
        SpringApplication.run(RootConfigClientApp.class, args);
    }
}
//spring.cloud.config 配置在bootstrap.properties 否则不生效
//需要使用postman post请求访问 http://localhost:8025/refresh    