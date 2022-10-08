package com.hk.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangK
 * @version 2022/8/19
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController
{
    @Value("${user.name}")
    private String username;

    @GetMapping("show")
    public String show()
    {
        return username;
    }
}