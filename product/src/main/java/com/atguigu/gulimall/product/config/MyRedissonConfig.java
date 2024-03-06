package com.atguigu.gulimall.product.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * ClassName: MyRedissonConfig
 * Package: com.atguigu.gulimall.product.config
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/17 - 10:38
 * @Version: v1.0
 */
@Configuration
public class MyRedissonConfig {
    @Bean(destroyMethod = "shutdown")
    RedissonClient redisson() throws IOException{
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.56.10:6379");

        RedissonClient redissonClient = Redisson.create(config);
        return redissonClient;
    }
}
