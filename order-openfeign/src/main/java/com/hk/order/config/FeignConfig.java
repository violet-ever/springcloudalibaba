package com.hk.order.config;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 全局配置：使用@Configuration
 * 局部配置：不加@Configuration，在对应的service中使用@FeignClient(configuration = XXX.class)进行应用
 *
 * @author huangkui
 * @version 2022/7/14 20:34
 */
@Configuration
public class FeignConfig
{
    @Bean
    public Logger.Level feignLoggerLevel()
    {
        return Level.FULL;
    }
}
