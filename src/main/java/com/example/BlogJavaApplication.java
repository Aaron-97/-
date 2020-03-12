package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@MapperScan("com.example.Mapper")
public class BlogJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogJavaApplication.class, args);
	}

}
