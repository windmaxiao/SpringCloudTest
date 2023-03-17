package com.wind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author maxiao
 * path对应和Controller的@RequestMappin
 */
@FeignClient(name = "product-service", path = "/product")
public interface ProductFeignService {

    /**
     * 和Controller写法一样
     * @param id id
     * @return query
     */
    @RequestMapping("/query/{id}")
    String queryProduct(@PathVariable("id") String id);
}
