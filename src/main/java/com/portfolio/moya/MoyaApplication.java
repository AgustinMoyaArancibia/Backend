package com.portfolio.moya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.portfolio.moya.Security.Repository"})
public class MoyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoyaApplication.class, args);
	}

}
