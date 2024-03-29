package com.wind;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author maxiao
 *  EnableDiscoveryClient 注解可加可不加
 */
@SpringBootApplication
@EnableFeignClients
public class OrderApplication {


    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }

}
