package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *  @项目名：  ssm 
 *  @包名：    com.itheima
 *  @文件名:   MainApp
 *  @创建者:   xiaomi
 *  @创建时间:  2018/9/4 14:29
 *  @描述：    TODO
 */

@SpringBootApplication
@MapperScan(basePackages = "com.itheima.mapper")
public class MainApp {

    public static void main(String [] args){
        SpringApplication.run(MainApp.class , args);
    }
}
