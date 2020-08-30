package com.ldr.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by LD
 * 2020/8/27 17:31
 **/
@Configuration
public class MyselfRule {

    @Bean
    public IRule myrule(){
        return new RandomRule();

    }
}
