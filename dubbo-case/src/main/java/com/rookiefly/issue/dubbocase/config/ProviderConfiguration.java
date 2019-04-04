package com.rookiefly.issue.dubbocase.config;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "com.rookiefly.issue.dubbocase.service.impl")
@DubboComponentScan(basePackages = "com.rookiefly.issue.dubbocase.service.impl")
public class ProviderConfiguration {
       
}