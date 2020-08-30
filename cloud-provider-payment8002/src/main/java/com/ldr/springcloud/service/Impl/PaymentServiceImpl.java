package com.ldr.springcloud.service.Impl;

import com.ldr.springcloud.dao.PaymentDao;
import com.ldr.springcloud.entities.Payment;
import com.ldr.springcloud.service.PaymentService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LD
 * 2020/8/22 16:23
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
