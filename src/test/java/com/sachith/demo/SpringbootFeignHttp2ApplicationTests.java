package com.sachith.demo;

import com.sachith.demo.client.JSONPlaceHolderClient;
import com.sachith.demo.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootFeignHttp2ApplicationTests {

	@Autowired
	JSONPlaceHolderClient jsonPlaceHolderClient;

	@Test
	void contextLoads() {
	}

	@Test
	void testApi(){
		List<User> users = jsonPlaceHolderClient.getUsers();
		users.forEach(System.out::println);
	}



}
