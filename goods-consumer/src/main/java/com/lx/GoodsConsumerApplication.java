package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lx
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class GoodsConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsConsumerApplication.class, args);
    }

}
