package com.atguigu.gulimall.order.feign;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.order.vo.WareSkuLockVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ClassName: WmsFeignService
 * Package: com.atguigu.gulimall.order.feign
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/1 - 16:30
 * @Version: v1.0
 */
@FeignClient("ware")
public interface WmsFeignService {

    @PostMapping("/ware/waresku/hasstock")
    R getSkuHasStock(@RequestBody List<Long> skuIds);

    @GetMapping("/ware/wareinfo/fare")
    R getFare(@RequestParam("addrId") Long addrId);

    @PostMapping(value = "/ware/waresku/lock/order")
    R orderLockStock(@RequestBody WareSkuLockVo vo);
}
