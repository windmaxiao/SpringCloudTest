package com.wind.Interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author maxiao
 */
public class FeignInterceptor implements RequestInterceptor {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void apply(RequestTemplate requestTemplate) {

        requestTemplate.header("FeignInterceptor", "FeignInterceptor1");
        logger.info("fegin拦截器");
    }
}
