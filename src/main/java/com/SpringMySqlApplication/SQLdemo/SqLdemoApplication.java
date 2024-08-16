package com.SpringMySqlApplication.SQLdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.SpringMySqlApplication.SQLdemo")
public class SqLdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqLdemoApplication.class, args);
	}

}
