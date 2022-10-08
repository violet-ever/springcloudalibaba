package com.hk.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangkui
 * @version 2022/6/28 16:21
 */
@RestController
@RequestMapping("/stock")
public class StockController
{
    @RequestMapping("/reduce")
    public String reduce()
    {
        System.out.println("扣减库存");
        return "扣减库存";
    }
}
