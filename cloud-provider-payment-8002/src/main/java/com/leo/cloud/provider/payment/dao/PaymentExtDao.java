package com.leo.cloud.provider.payment.dao;

import com.leo.cloud.api.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description
 * @Author Leo
 * @Date 2020/12/26 16:27
 */
@Mapper
public interface PaymentExtDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}

