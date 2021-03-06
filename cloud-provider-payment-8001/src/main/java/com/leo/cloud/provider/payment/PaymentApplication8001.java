package com.leo.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentApplication
 * @Description
 * @Author Leo
 * @Date 2020/12/26 16:09
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class,args);
    }

}
