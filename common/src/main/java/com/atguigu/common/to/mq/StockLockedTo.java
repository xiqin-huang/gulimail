package com.atguigu.common.to.mq;

import lombok.Data;

/**
 * ClassName: StockLockedTO
 * Package: com.atguigu.common.to.mq
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/4 - 10:35
 * @Version: v1.0
 */
@Data
public class StockLockedTo {

    /** 库存工作单的id **/
    private Long id;

    /** 工作单详情的所有信息 **/
    private StockDetailTo detailTo;
}
