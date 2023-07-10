package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author lx
 */
@SpringBootApplication
public class GatewayServeiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServeiceApplication.class, args);
    }

}
