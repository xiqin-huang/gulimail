package com.atguigu.gulimall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: GulimallSearchApplication
 * Package: com.atguigu.gulimall.search
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/13 - 9:52
 * @Version: v1.0
 */
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class GulimallSearchApplication {
    public static void main(String[] args){
        SpringApplication.run(GulimallSearchApplication.class,args);
    }
}
