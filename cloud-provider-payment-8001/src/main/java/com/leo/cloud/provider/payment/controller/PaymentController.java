package com.leo.cloud.provider.payment.controller;

import com.leo.cloud.api.common.entity.CommonResult;
import com.leo.cloud.api.common.entity.Payment;
import com.leo.cloud.provider.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description
 * @Author Leo
 * @Date 2020/12/26 17:40
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("-----结果:" + result);
        if (result > 0) {
            return new CommonResult(200,"success",result);
        } else {
            return new CommonResult(444,"fail",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("-----结果:" + payment);
        if (payment != null) {
            return new CommonResult(200,"success,serverPort:" + serverPort,payment);
        } else {
            return new CommonResult(444,"fail",null);
        }
    }


}
