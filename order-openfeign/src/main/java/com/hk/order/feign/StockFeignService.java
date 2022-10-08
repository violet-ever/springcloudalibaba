package com.hk.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * name:指定调用rest接口所对应的服务   path:指定rest接口所在的stockController指定的@RequestMapping
 *
 * @author huangkui
 * @version 2022/7/14 20:29
 */
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignService
{
    @RequestMapping("/reduce")
    String reduce();
}
