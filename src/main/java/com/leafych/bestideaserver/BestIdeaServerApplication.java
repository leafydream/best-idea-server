package com.leafych.bestideaserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.leafych.bestideaserver.dao")
@SpringBootApplication
public class BestIdeaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestIdeaServerApplication.class, args);
    }
}

