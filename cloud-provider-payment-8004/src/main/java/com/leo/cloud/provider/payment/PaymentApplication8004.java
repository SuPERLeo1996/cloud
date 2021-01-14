package com.leo.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentApplication
 * @Description
 * @Author Leo
 * @Date 2020/12/26 16:09
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class,args);
    }

}
