package com.leo.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentApplication8006
 * @Description
 * @Author Leo
 * @Date 2021/1/16 14:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8006 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8006.class,args);
    }
}
