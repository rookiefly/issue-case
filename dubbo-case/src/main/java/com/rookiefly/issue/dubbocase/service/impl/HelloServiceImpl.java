package com.rookiefly.issue.dubbocase.service.impl;

import com.rookiefly.issue.dubbocase.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Date;

@Service(version = "1.0.1")
public class HelloServiceImpl implements HelloService {

	@Override
    public String sayHello(String name) {
        return "Hello, " + name + ", " + new Date();
    }

}