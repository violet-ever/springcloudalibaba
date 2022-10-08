package com.hk.order.controller;

import com.hk.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangkui
 * @version 2022/6/28 16:19
 */
@RestController
@RequestMapping("/order")
public class OrderController
{
    @Autowired
    private StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add()
    {
        String forObject = stockFeignService.reduce();
        return "下单成功  " + forObject;
    }
}
