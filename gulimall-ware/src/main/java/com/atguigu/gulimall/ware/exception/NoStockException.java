package com.atguigu.gulimall.ware.exception;

/**
 * ClassName: NoStockException
 * Package: com.atguigu.gulimall.ware.exception
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/3 - 9:04
 * @Version: v1.0
 */
public class NoStockException extends RuntimeException{
    private Long skuId;

    public NoStockException(Long skuId){
        super("商品ID为"+skuId+"没有足够的库存了");
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}
