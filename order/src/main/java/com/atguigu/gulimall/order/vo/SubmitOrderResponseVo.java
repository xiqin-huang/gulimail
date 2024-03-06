package com.atguigu.gulimall.order.vo;

import com.atguigu.gulimall.order.entity.OrderEntity;
import lombok.Data;

/**
 * ClassName: SubmitOrderResponseVo
 * Package: com.atguigu.gulimall.order.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/2 - 15:50
 * @Version: v1.0
 */
@Data
public class SubmitOrderResponseVo {
    private OrderEntity order;

    /** 错误状态码 **/
    private Integer code;
}
