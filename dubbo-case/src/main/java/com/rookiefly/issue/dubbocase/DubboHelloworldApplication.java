package com.rookiefly.issue.dubbocase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * vm options -Dcsp.sentinel.api.port=8720 -Dcsp.sentinel.dashboard.server=localhost:8697 -Dproject.name=dubbo-provider-demo
 */
@SpringBootApplication
public class DubboHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboHelloworldApplication.class, args);
    }

}
