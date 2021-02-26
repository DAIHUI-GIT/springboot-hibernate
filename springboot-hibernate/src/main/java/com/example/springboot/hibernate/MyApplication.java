package com.example.springboot.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 当该启动类不在root（根）包下配置
 * @ComponentScan(basePackages = "xxx.xxx.xxx")：扫描 @Controller、@Service 注解；
 * @EnableJpaRepositories(basePackages = "xxx.xxx.xxx")：扫描 @Repository 注解；
 * @EntityScan(basePackages = "xxx.xxx.xxx")：扫描 @Entity 注解；
 */
public class MyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class,args);
	}
	
}
