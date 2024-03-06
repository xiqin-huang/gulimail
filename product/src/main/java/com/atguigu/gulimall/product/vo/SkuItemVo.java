package com.atguigu.gulimall.product.vo;

import com.atguigu.gulimall.product.entity.SkuImagesEntity;
import com.atguigu.gulimall.product.entity.SkuInfoEntity;
import com.atguigu.gulimall.product.entity.SpuInfoDescEntity;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * ClassName: SkuItemVo
 * Package: com.atguigu.gulimall.product.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/22 - 14:53
 * @Version: v1.0
 */
@Data
public class SkuItemVo {

    //1.sku基本信息获取 pms_sku_info
    SkuInfoEntity info;

    boolean hasStock = true;
    //2.sku图片信息 pms_sku_images
    List<SkuImagesEntity> images;

    //3.spu的销售属性组合
    List<SkuItemSaleAttrVo> saleAttr;

    //4.spu的详细介绍
    SpuInfoDescEntity desp;

    //5.规格参数
    List<SpuItemAttrGroupVo> groupAttrs;

    //6.当前商品的秒杀优惠信息
//    SeckillInfoVo seckillInfo;







}
