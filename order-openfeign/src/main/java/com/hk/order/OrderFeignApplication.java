package com.hk.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangkui
 * @version 2022/6/28 16:22
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderFeignApplication.class, args);
    }
}
