package com.wind.config;


import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * 使用Configuration会全局服务配置
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 超时时间配置
     * @return Request.Options
     */
    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }

}
