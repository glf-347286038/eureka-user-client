package com.springcloudbase.eurekauserclient.controller;

import com.springcloudbase.eurekauserclient.client.DogClient;
import com.springcloudbase.eurekauserclient.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gaolingfeng
 */
@RestController
public class UserController {
    @Autowired
    private DogClient dogClient;
    @GetMapping("userQueryDogs")
    public List<Dog> userQueryDogs(Dog dog){
        return dogClient.queryDogs(dog);
    }
}
