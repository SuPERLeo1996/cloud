package com.leo.cloud.provider.payment.service.impl;

import com.leo.cloud.provider.payment.dao.PaymentDao;
import com.leo.cloud.provider.payment.entity.Payment;
import com.leo.cloud.provider.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description
 * @Author Leo
 * @Date 2020/12/26 17:38
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
