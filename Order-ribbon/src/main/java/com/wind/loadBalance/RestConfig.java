package com.wind.loadBalance;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 在这里配置我们自定义的LoadBalancer策略 如果想自己扩展算法 需要实现ReactorServiceInstanceLoadBalancer接口
 * @ LoadBalancerClients(defaultConfiguration = {name = "CLOUD-PAYMENT-SERVICE", configuration = MyLoadBalancerConfig.class})
 * 注意这里的name属性 需要和eureka页面中的服务提供者名字一致
 * @author maxiao
 */
@Configuration
@LoadBalancerClient(name = "stock-service",configuration = MyLoadBalancerConfig.class)
public class RestConfig {
    //将这个对象放入ioc容器
    @Bean
    @LoadBalanced
    //使用这个注解给restTemplate赋予了负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
