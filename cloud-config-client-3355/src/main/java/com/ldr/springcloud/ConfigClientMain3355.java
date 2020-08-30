package com.ldr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by LD
 * 2020/8/29 14:11
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
//
//    /*
//    ********手动版动态更新**********
//    当GITHUB上面修改成功以后ConfigCenter会自动更新
//    但是客户机们要运维发一段POST命令才会生效
//    curl -X POST "http://localhost:配置中心端口号/actuator/bus-refresh/{destination}"
//     */

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class,args);
    }
}
