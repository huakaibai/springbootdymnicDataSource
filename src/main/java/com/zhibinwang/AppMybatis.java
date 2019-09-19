package com.zhibinwang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zhibinwang.mapper")
public class AppMybatis {

	public static void main(String[] args) {
		SpringApplication.run(AppMybatis.class, args);
	}

}
