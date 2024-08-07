package com.board.main1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Main1Application {

	public static void main(String[] args) {
		SpringApplication.run(Main1Application.class, args);
	}

}


/* spring security 기본 계정 - "user" // "PASSWORD" */