package com.ldr.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by LD
 * 2020/8/28 2:01
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back.paymentInfo_OK ";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back.paymentInfo_TimeOut ";
    }
}