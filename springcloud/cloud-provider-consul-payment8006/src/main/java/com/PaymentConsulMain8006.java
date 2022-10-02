package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: pwz
 * @create: 2022/9/30 15:40
 * @Description:
 * @FileName: PaymentMain8006
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulMain8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain8006.class,args);
    }

}