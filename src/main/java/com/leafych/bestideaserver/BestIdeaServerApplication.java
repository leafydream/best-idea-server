package com.leafych.bestideaserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.PostConstruct;

@MapperScan("com.leafych.bestideaserver.dao")
@SpringBootApplication
public class BestIdeaServerApplication {

    @Autowired
    private RedisTemplate redisTemplate = null;

    // 定义自定义后初始化方法
    @PostConstruct
    public void init() {
        initRedisTemplate();
    }

    // 设置RedisTemplate的序列器
    private void initRedisTemplate() {
        RedisSerializer stringSeriaizer = redisTemplate.getStringSerializer();
        redisTemplate.setKeySerializer(stringSeriaizer);
        redisTemplate.setHashKeySerializer(stringSeriaizer);
    }

    public static void main(String[] args) {
        SpringApplication.run(BestIdeaServerApplication.class, args);
    }
}

