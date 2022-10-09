package com.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: pwz
 * @create: 2022/10/9 15:23
 * @Description:
 * @FileName: MyBatisConfig
 */
@Configuration
@MapperScan({"com.springcloud.dao"})
public class MyBatisConfig {
}
