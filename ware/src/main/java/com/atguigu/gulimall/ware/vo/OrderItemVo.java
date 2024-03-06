package com.atguigu.gulimall.ware.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: OrderItemVo
 * Package: com.atguigu.gulimall.order.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/1 - 10:26
 * @Version: v1.0
 */
@Data
public class OrderItemVo {
    private Long skuId;

    //private Boolean check;

    private String title;

    private String image;

    /**
     * 商品套餐属性
     */
    private List<String> skuAttr;

    private BigDecimal price;

    private Integer count;

    private BigDecimal totalPrice;

    /** 商品重量 **/
    private BigDecimal weight = new BigDecimal("0.085");
}
