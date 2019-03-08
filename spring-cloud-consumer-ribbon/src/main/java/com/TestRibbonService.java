package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestRibbonService {
    @Autowired 
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getProviderContent() {
        return restTemplate.getForObject("http://provider-service/test/test",String.class);
    }
    
    public String serviceFailure() {
    	return "provider-service is not available !";
    }
}

