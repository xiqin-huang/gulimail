package com.atguigu.gulimall.order.feign;

import com.atguigu.gulimall.order.vo.OrderItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * ClassName: CartFeignService
 * Package: com.atguigu.gulimall.order.feign
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/1 - 11:20
 * @Version: v1.0
 */
@FeignClient("cart")
public interface CartFeignService {
    @GetMapping("/currentUserCartItems")
    List<OrderItemVo> getCurrentUserCartItems();
}
