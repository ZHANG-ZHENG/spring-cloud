package com;

import org.springframework.stereotype.Component;

@Component
public class TestFeignServiceFailure implements TestFeignService {
    @Override
    public String getProviderTest() {
        return "provider-service is not available !";
    }
}

//参考https://www.cnblogs.com/chry/p/7266916.html