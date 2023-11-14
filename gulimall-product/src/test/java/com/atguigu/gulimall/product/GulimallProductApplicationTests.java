//package com.atguigu.gulimall.product;
//
//
//import com.atguigu.gulimall.product.entity.BrandEntity;
//import com.atguigu.gulimall.product.service.BrandService;
//import com.atguigu.gulimall.product.service.CategoryService;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.Arrays;
//import java.util.List;
//
//
///**
// * 1、引入oss-starter
// * 2、配置key，endpoint相关信息即可
// * 3、使用OSSClient 进行相关操作
// */
//@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class GulimallProductApplicationTests {
//
//    @Autowired
//    BrandService brandService;
//
////    @Autowired
////    OSSClient ossClient;
//
//    @Autowired
//    CategoryService categoryService;
//
//    @Test
//    public void testUpload() throws FileNotFoundException {
//
//        //上传文件流
////        InputStream inputStream = new FileInputStream("D:\\java\\谷粒商城\\Guli Mall(包含代码、课件、sql)\\Guli Mall\\分布式基础\\资源\\pics\\0d40c24b264aa511.jpg");
////        ossClient.putObject("gulimall-xiqin","bug1.jpg",inputStream);
////
////        ossClient.shutdown();
////        System.out.println("上传完成");
//    }
//
//    @Test
//    public void testFindPath(){
//        Long[] catelogPath = categoryService.findCatelogPath(225L);
//        log.info("完整路径：{}",Arrays.asList(catelogPath));
//    }
//
//
//    @Test
//    public void contextLoads() {
//
////        BrandEntity brandEntity = new BrandEntity();
////        brandEntity.setBrandId(1L);
////        brandEntity.setDescript("华为");
//
////
////        brandEntity.setName("华为");
////        brandService.save(brandEntity);
////        System.out.println("保存成功....");
//
////        brandService.updateById(brandEntity);
//
//
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach((item) -> {
//            System.out.println(item);
//        });
//
//    }
//
//}
