package com.springcloud.service;

/**
 * @author: pwz
 * @create: 2022/10/9 15:21
 * @Description:
 * @FileName: StorageService
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}

