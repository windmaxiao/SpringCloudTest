package com.wind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author maxiao
 * path对应和Controller的@RequestMappin
 */
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignService {

    /**
     * 和Controller写法一样
     * @return reduce
     */
    @RequestMapping("/reduce")
    String reduce();
}
