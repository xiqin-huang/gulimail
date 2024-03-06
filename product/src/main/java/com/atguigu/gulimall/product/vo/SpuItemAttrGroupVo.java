package com.atguigu.gulimall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * ClassName: SpuItemAttrGroupVo
 * Package: com.atguigu.gulimall.product.vo
 * Description:
 *
 * @Author: xiqin
 * @Create: 2023/11/22 - 15:50
 * @Version: v1.0
 */
@ToString
@Data
public class SpuItemAttrGroupVo{
    private String groupName;
    private List<Attr> attrs;
}
