package com.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: pwz
 * @create: 2022/9/29 15:48
 * @Description:
 * @FileName: ApplicationContextConfig
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  // 使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}