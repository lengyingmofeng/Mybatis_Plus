package com.yefeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//扫描mapper包下的所有接口
@MapperScan("com.yefeng.mapper")
@SpringBootApplication
public class MybatisPlus01HelloMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus01HelloMybatisPlusApplication.class, args);
    }

}