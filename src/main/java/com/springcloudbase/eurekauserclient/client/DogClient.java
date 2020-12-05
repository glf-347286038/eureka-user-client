package com.springcloudbase.eurekauserclient.client;

import com.springcloudbase.eurekauserclient.entity.Dog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * eureka-pet-client 为供应方对外公开的项目名
 * @author gaolingfeng
 */
@FeignClient("eureka-pet-client")
public interface DogClient {

    /**
     * queryDogs为 供应方的Controller地址
     * @return
     */
    @PostMapping("queryDogs")
    public List<Dog> queryDogs(Dog dog);
}
