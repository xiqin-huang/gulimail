package com.atguigu.gulimall.member.vo;

import lombok.Data;

/**
 * ClassName: SocialUser
 * Package: com.atguigu.gulimall.auth.Vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/26 - 16:25
 * @Version: v1.0
 */
@Data
public class SocialUser {

    private String access_token;

    private String token_type;

    private long expires_in;

    private String scope;

    private String created_at;

}
