package com.atguigu.gulimall.member.exception;

/**
 * ClassName: PhoneExistException
 * Package: com.atguigu.gulimall.member.exception
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/25 - 17:30
 * @Version: v1.0
 */

public class PhoneExistException extends RuntimeException {
    public PhoneExistException() {
        super("存在相同的手机号");
    }
}
