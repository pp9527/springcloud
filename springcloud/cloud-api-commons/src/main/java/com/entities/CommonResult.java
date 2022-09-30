package com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: pwz
 * @create: 2022/9/29 11:05
 * @Description: 返回结果
 * @FileName: CommonResult
 */
@Data
@AllArgsConstructor@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}