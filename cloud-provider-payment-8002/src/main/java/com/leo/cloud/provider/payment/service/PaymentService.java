package com.leo.cloud.provider.payment.service;


import com.leo.cloud.api.common.entity.Payment;

/**
 * @ClassName PaymentService
 * @Description
 * @Author Leo
 * @Date 2020/12/26 17:38
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
