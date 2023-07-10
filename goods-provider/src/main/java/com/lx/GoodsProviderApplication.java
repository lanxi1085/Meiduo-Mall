package com.lx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lx
 */

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(value = "com.lx.dao")
public class GoodsProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodsProviderApplication.class, args);
	}

}
