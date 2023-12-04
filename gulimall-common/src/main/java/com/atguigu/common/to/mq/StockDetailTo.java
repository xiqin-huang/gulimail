package com.atguigu.common.to.mq;

import lombok.Data;

/**
 * ClassName: StockDeatilTo
 * Package: com.atguigu.common.to.mq
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/4 - 10:37
 * @Version: v1.0
 */
@Data
public class StockDetailTo {

    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * 购买个数
     */
    private Integer skuNum;
    /**
     * 工作单id
     */
    private Long taskId;

    /**
     * 仓库id
     */
    private Long wareId;

    /**
     * 锁定状态
     */
    private Integer lockStatus;

}