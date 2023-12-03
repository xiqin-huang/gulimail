package com.atguigu.gulimall.order.web;

import com.atguigu.gulimall.order.feign.CartFeignService;
import com.atguigu.gulimall.order.service.OrderService;
import com.atguigu.gulimall.order.vo.OrderConfirmVo;
import com.atguigu.gulimall.order.vo.OrderSubmitVo;
import com.atguigu.gulimall.order.vo.SubmitOrderResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutionException;

/**
 * ClassName: OrderWebController
 * Package: com.atguigu.gulimall.order.web
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/12/1 - 10:04
 * @Version: v1.0
 */
@Controller
public class OrderWebController {

    @Autowired
    OrderService orderService;


    @GetMapping("toTrade")
    public String toTrade(Model model, HttpServletRequest request) throws ExecutionException, InterruptedException {
        OrderConfirmVo confirmVo = orderService.confirmOrder();

        model.addAttribute("orderConfirmData",confirmVo);

        return "confirm";
    }

    @PostMapping("/submitOrder")
    public String submitOrder(OrderSubmitVo vo,Model model){
        SubmitOrderResponseVo responseVo = orderService.submitOrder(vo);
        //去创建订单，验证令牌，锁库存
//        System.out.println("订单提交的数据"+vo);
        if(responseVo.getCode() == 0){
            //成功去支付选择页
            model.addAttribute("submitOrderResp",responseVo);
            return "pay";
        }else {
            //失败返回订单页
            return "redirect:http://order.gulimall.com/toTrade";
        }
    }
}
