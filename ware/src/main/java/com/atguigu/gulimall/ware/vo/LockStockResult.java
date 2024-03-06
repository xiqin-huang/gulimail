package com.atguigu.gulimall.ware.vo;

import lombok.Data;

/**
 * ClassName: LockStockResult
 * Package: com.atguigu.gulimall.ware.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/2 - 17:40
 * @Version: v1.0
 */
@Data
public class LockStockResult {

    private Long skuId;

    private Integer num;

    /** 是否锁定成功 **/
    private Boolean locked;

}
