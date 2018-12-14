package com.warren.space;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @EnableTransactionManagement  开启事务
 * @MapperScan  mybatis配置知道mapper路径
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.warren.space.mapper")
public class PersonalSpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalSpaceApplication.class, args);
	}


}
