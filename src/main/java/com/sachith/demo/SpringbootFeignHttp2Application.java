package com.sachith.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootFeignHttp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFeignHttp2Application.class, args);
	}

}
