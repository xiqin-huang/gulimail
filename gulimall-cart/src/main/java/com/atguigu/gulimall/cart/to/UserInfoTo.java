package com.atguigu.gulimall.cart.to;

import lombok.Data;
import lombok.ToString;

/**
 * ClassName: UserInfoVo
 * Package: com.atguigu.gulimall.cart.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/28 - 10:00
 * @Version: v1.0
 */
@ToString
@Data
public class UserInfoTo {

    private Long userId;
    private String userKey;
    private Boolean tempUser = false;
}
