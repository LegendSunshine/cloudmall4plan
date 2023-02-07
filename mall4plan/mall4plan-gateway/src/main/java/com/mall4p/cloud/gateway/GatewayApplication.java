package com.mall4p.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName GatewayApplication
 * @Date 2023/2/7 14:52
 * @Author legend
 */
@SpringBootApplication(scanBasePackages = {"com.mall4p.cloud"})
public class GatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class);
    }
}
