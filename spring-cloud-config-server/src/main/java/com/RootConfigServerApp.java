package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class RootConfigServerApp {

    public static void main(String [] args) {
        SpringApplication.run(RootConfigServerApp.class, args);
    }
}

//启动程序：访问http://localhost:8020/zuul/dev
//git地址 uri ）中有一个文件 zuul-dev.properties ;