package com.hangduo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hangduo.dao")

public class HangduoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HangduoApplication.class, args);
    }

}

