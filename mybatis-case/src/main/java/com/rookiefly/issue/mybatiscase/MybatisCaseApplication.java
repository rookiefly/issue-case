package com.rookiefly.issue.mybatiscase;

import com.rookiefly.issue.mybatiscase.mapper.CityMapper;
import com.rookiefly.issue.mybatiscase.mapper.GorderMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisCaseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MybatisCaseApplication.class, args);
    }

    private final CityMapper cityMapper;

    private final GorderMapper gorderMapper;

    public MybatisCaseApplication(CityMapper cityMapper, GorderMapper gorderMapper) {
        this.cityMapper = cityMapper;
        this.gorderMapper = gorderMapper;
    }

    @Override
    public void run(String... args) {
        System.out.println(this.cityMapper.findByState("CA"));
        System.out.println(this.gorderMapper.gorderList("rookiefly@163.com"));
        System.out.println(this.gorderMapper.gorderListNested("rookiefly@163.com"));
    }
}
