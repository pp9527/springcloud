package com.springcloud.domain;

import lombok.Data;

/**
 * @author: pwz
 * @create: 2022/10/9 15:19
 * @Description:
 * @FileName: Storage
 */
@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}
