package com.ldr.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created by LD
 * 2020/8/27 19:45
 **/
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
