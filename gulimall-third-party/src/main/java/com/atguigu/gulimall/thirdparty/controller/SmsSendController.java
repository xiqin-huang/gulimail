package com.atguigu.gulimall.thirdparty.controller;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.thirdparty.component.SmsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: SmsSendController
 * Package: com.atguigu.gulimall.thirdparty.controller
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/25 - 10:07
 * @Version: v1.0
 */
@RestController
@RequestMapping("/sms")
public class SmsSendController {

    @Autowired
    SmsComponent smsComponent;

    @GetMapping("/sendcode")
    public R sendCode(@RequestParam("phone") String phone,@RequestParam("code") String code){
        smsComponent.sendSmsCode(phone,code);
        System.out.println(code);

        return R.ok();
    }
}
