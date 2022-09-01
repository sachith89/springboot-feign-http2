package com.sachith.demo.client;

import com.sachith.demo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "service", url = "https://jsonplaceholder.typicode.com")
public interface JSONPlaceHolderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    List<User> getUsers();
}
