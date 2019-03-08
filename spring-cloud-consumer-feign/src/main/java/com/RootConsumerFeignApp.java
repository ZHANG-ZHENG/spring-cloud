package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class RootConsumerFeignApp {

    public static void main(String [] args) {
        SpringApplication.run(RootConsumerFeignApp.class, args);
    }
}
