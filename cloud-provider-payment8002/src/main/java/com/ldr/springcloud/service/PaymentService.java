package com.ldr.springcloud.service;

import com.ldr.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by LD
 * 2020/8/22 16:22
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
