package com.atguigu.gulimall.order.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: HelloController
 * Package: com.atguigu.gulimall.order.web
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/29 - 17:19
 * @Version: v1.0
 */
@Controller
public class HelloController {

    @GetMapping("/{page}.html")
    public String listPage(@PathVariable("page") String page) {
        return page;
    }
}
