package com.atguigu.gulimall.ware.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: MemberFeignService
 * Package: com.atguigu.gulimall.ware.feign
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/1 - 16:54
 * @Version: v1.0
 */
@FeignClient("member")
public interface MemberFeignService {

    @RequestMapping("/member/memberreceiveaddress/info/{id}")
    R addrInfo(@PathVariable("id") Long id);
}
