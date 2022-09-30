package com.dao;

import com.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: pwz
 * @create: 2022/9/29 14:41
 * @Description:
 * @FileName: PaymentDao
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}