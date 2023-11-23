package com.atguigu.gulimall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * ClassName: SkuItemSaleAttrVo
 * Package: com.atguigu.gulimall.product.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/22 - 15:52
 * @Version: v1.0
 */
@ToString
@Data
public class SkuItemSaleAttrVo{
    private Long attrId;
    private String attrName;
    private List<AttrValueWithSkuIdVo> attrValues;
}
