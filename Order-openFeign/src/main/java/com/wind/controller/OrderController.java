package com.wind.controller;

import com.wind.feign.ProductFeignService;
import com.wind.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author maxiao
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;
    @Autowired
    ProductFeignService productFeignService;

    @RequestMapping("/add/{id}")
    public String add(@PathVariable String id) {
        System.out.println("stockFeignService---");

        productFeignService.queryProduct(id);

        String msg = stockFeignService.reduce();

        return "FeignService add ok！" + msg;
    }

}
