package com.atguigu.gulimall.ware.vo;

import lombok.Data;

/**
 * ClassName: SkuHasStockVo
 * Package: com.atguigu.gulimall.ware.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/14 - 10:18
 * @Version: v1.0
 */
@Data
public class SkuHasStockVo {
    private Long skuId;
    private Boolean hasStock;
}
