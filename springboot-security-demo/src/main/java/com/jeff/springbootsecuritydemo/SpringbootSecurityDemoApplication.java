package com.jeff.springbootsecuritydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jeff.springbootsecuritydemo.mapper")
public class SpringbootSecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurityDemoApplication.class, args);
    }

}
