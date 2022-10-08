package com.hk.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangkui
 * @version 2022/6/28 16:19
 */
@RestController
@RequestMapping("/order")
public class OrderController
{
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add()
    {
        System.out.println("下单成功");
        String forObject = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        return "下单成功  " + forObject;
    }
}
