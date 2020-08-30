package com.ldr.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by LD
 * 2020/8/23 16:48
 **/
@Configuration
public class ApplicationContextConfig {

    //注入RestTemplate依赖
    @Bean
    @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
