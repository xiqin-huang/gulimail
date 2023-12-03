package com.atguigu.gulimall.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: ThreadPoolConfigProperties
 * Package: com.atguigu.gulimall.product.config
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/22 - 17:35
 * @Version: v1.0
 */
@ConfigurationProperties(prefix = "gulimall.thread")
@Component
@Data
public class ThreadPoolConfigProperties {
    private Integer coreSize;
    private Integer maxSize;
    private Integer keepAliveTime;
}
