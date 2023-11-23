package com.atguigu.gulimall.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: GulimallAuthServerApplication
 * Package: com.atguigu.gulimall.auth
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/23 - 15:20
 * @Version: v1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallAuthServerApplication.class,args);
    }
}
