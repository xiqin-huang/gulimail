package com.atguigu.gulimall.product.web;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import com.atguigu.gulimall.product.vo.Catelog2Vo;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: IndexController
 * Package: com.atguigu.gulimall.product.web
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/15 - 10:01
 * @Version: v1.0
 */
@Controller
public class IndexController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    RedissonClient redisson;

    @GetMapping({"/", "/index.html"})
    public String indexPage(Model model) {
        List<CategoryEntity> categoryList = categoryService.getLevel1Catagorys();
        model.addAttribute("categorys", categoryList);
        return "index";
    }


    @ResponseBody
    @GetMapping("/index/catalog.json")
    public Map<String, List<Catelog2Vo>> getCatalogJson() {
        Map<String, List<Catelog2Vo>> catalogJson = categoryService.getCatalogJson();
        return catalogJson;
    }


    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        //获取一把锁，只要锁名称一样，就是同一把锁
        RLock lock = redisson.getLock("my-lock");

        lock.lock(30, TimeUnit.SECONDS);
        try{
            System.out.println("加锁成功"+Thread.currentThread().getId());
            Thread.sleep(30000);
        }catch (Exception e){

        }finally{
            System.out.println("释放锁"+Thread.currentThread().getId());
            lock.unlock();
        }

        return "hello";
    }
}
