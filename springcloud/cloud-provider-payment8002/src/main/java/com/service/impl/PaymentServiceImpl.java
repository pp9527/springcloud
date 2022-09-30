package com.service.impl;

import com.dao.PaymentDao;
import com.entities.Payment;
import com.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: pwz
 * @create: 2022/9/29 14:53
 * @Description:
 * @FileName: PaymentServiceImpl
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}