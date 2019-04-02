package com.rookiefly.issue.mybatiscase;

import com.rookiefly.issue.mybatiscase.mapper.CityMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisCaseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MybatisCaseApplication.class, args);
    }

    private final CityMapper cityMapper;

    public MybatisCaseApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public void run(String... args) {
        System.out.println(this.cityMapper.findByState("CA"));
    }
}
