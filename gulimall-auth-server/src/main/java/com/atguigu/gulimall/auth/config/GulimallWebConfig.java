package com.atguigu.gulimall.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: GulimallWebConfig
 * Package: com.atguigu.gulimall.auth.config
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/23 - 16:33
 * @Version: v1.0
 */
@Configuration
public class GulimallWebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/reg.html").setViewName("reg");
    }
}
