package com.atguigu.gulimall.member.exception;

/**
 * ClassName: UsernameExistException
 * Package: com.atguigu.gulimall.member.exception
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/25 - 17:28
 * @Version: v1.0
 */
public class UsernameExistException extends RuntimeException {
    public UsernameExistException() {
        super("存在相同的用户名");
    }
}