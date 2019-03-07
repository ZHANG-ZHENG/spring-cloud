package com;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController{

    @Value("${foo}")
    private String foo;
    
//    @Autowired
//    private Environment environment;
    
    @RequestMapping(value = "/test")
    public String test(){
    	System.out.println(foo);
        return foo;
    }
    

	

	



}
