package com.sachith.demo;

import com.sachith.demo.client.JSONPlaceHolderClient;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RequiredArgsConstructor
public class SpringbootFeignHttp2Application implements CommandLineRunner {

    private final JSONPlaceHolderClient client;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFeignHttp2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        client.getUsers().stream()
                .forEach(System.out::println);
    }
}
