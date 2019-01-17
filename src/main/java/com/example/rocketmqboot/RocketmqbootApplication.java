package com.example.rocketmqboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.rocketmqboot.two.bean")
public class RocketmqbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketmqbootApplication.class, args);
    }

}

