package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * com.gitee.sunchenbin.mybatis.actable.dao.* 和 com.gitee.sunchenbin.mybatis.actable.manager.* 是actable的官方配置，照抄就行
 */
@SpringBootApplication
@MapperScan({ "com.gitee.sunchenbin.mybatis.actable.dao.*", "com.example.demo.mapper"})
@ComponentScan(basePackages = { "com.gitee.sunchenbin.mybatis.actable.manager.*", "com.example.demo.*"})
public class MybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}

}
