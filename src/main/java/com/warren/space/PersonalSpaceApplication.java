package com.warren.space;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @EnableTransactionManagement  开启事务
 * @MapperScan  mybatis配置知道mapper路径
 */
@RestController
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.warren.space.mapper")
public class PersonalSpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalSpaceApplication.class, args);
	}


	@RequestMapping("/hello")
	private  String index(){
		return "hello spring boot";
	}

}
