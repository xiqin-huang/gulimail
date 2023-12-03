package com.atguigu.gulimall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: FareVo
 * Package: com.atguigu.gulimall.order.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/2 - 16:29
 * @Version: v1.0
 */
@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}
