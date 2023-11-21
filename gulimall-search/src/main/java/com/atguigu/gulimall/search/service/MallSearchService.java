package com.atguigu.gulimall.search.service;

import com.atguigu.gulimall.search.vo.SearchParam;
import com.atguigu.gulimall.search.vo.SearchResult;

/**
 * ClassName: MallSearchService
 * Package: com.atguigu.gulimall.search.service
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/18 - 16:43
 * @Version: v1.0
 */
public interface MallSearchService {

    //根据检索参数返回所有结果
    SearchResult search(SearchParam param);
}
