package com.service;

import com.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: pwz
 * @create: 2022/9/29 14:52
 * @Description:
 * @FileName: PaymentService
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}