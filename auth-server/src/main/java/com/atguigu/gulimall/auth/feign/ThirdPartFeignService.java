package com.atguigu.gulimall.auth.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: ThirdPartFeignService
 * Package: com.atguigu.gulimall.auth.feign
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/25 - 10:16
 * @Version: v1.0
 */
@FeignClient("third-party")
public interface ThirdPartFeignService {

    @GetMapping("/sms/sendcode")
    public R sendCode(@RequestParam("phone") String phone, @RequestParam("code") String code);
}
