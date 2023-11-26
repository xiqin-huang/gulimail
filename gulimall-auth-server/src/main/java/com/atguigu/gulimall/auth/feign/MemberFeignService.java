package com.atguigu.gulimall.auth.feign;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.auth.Vo.UserRegistVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * ClassName: MemberFeignService
 * Package: com.atguigu.gulimall.auth.feign
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/26 - 9:03
 * @Version: v1.0
 */
@FeignClient("gulimall-member")
public interface MemberFeignService {

    @PostMapping("member/member/regist")
    R regist(@RequestBody UserRegistVo vo);
}
