package com.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.entities.CommonResult;

/**
 * @author: pwz
 * @create: 2022/10/8 16:37
 * @Description:
 * @FileName: CustomerBlockHandler
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2022, "自定义限流处理信息......");
    }
}