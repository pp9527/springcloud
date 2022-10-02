package com.service.impl;

import com.service.PaymentHystrixService;
import org.springframework.stereotype.Service;

/**
 * @author: pwz
 * @create: 2022/10/2 14:12
 * @Description:
 * @FileName: PaymentFallbackService
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

}