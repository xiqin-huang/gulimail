package com.atguigu.gulimall.search.service;

import com.atguigu.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: ProductSavaService
 * Package: com.atguigu.gulimall.search.service
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/14 - 11:14
 * @Version: v1.0
 */
public interface ProductSavaService {
    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
