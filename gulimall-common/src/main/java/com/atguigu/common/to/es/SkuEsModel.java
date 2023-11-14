package com.atguigu.common.to.es;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: SkuEsModel
 * Package: com.atguigu.common.to.es
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/14 - 9:03
 * @Version: v1.0
 */
@Data
public class SkuEsModel {
    private Long skuId;

    private Long spuId;

    private String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    private Long saleCount;

    private Boolean hasStock;

    private Long hotScore;

    private Long brandId;

    private Long catalogId;

    private String brandName;

    private String brandImg;

    private String catalogName;

    private List<Attrs> attrs;

    @Data
    public static class Attrs{
        private Long attrId;
        private String attrName;
        private String attrValue;
    }
}
