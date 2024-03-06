package com.atguigu.gulimall.order.vo;

import lombok.Data;

/**
 * ClassName: SkuStockVo
 * Package: com.atguigu.gulimall.order.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/1 - 16:34
 * @Version: v1.0
 */
@Data
public class SkuStockVo {
    private Long skuId;
    private Boolean hasStock;
}
