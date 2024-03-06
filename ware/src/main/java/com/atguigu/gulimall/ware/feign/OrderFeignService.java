package com.atguigu.gulimall.ware.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: OrderFeignService
 * Package: com.atguigu.gulimall.ware.feign
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/4 - 15:05
 * @Version: v1.0
 */
@FeignClient("order")
public interface OrderFeignService {

 @GetMapping("/order/order/status/{orderSn}")
 R getOrderStatus(@PathVariable("orderSn") String orderSn);
}
