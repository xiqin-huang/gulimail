package com.atguigu.gulimall.ware.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: FareVo
 * Package: com.atguigu.gulimall.ware.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/1 - 17:26
 * @Version: v1.0
 */
@Data
public class FareVo {
    private MemberAddressVo address;
    private BigDecimal fare;
}
