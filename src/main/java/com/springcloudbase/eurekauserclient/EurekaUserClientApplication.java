package com.springcloudbase.eurekauserclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gaolingfeng
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaUserClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaUserClientApplication.class, args);
    }

}
