package com.atguigu.gulimall.order.vo;

import lombok.Data;

import java.util.List;

/**
 * ClassName: WareSkuLockVo
 * Package: com.atguigu.gulimall.order.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/2 - 17:36
 * @Version: v1.0
 */
@Data
public class WareSkuLockVo {

    private String orderSn;

    /** 需要锁住的所有库存信息 **/
    private List<OrderItemVo> locks;



}
