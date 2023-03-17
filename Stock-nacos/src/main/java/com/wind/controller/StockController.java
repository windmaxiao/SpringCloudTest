package com.wind.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maxiao
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;


    @RequestMapping("/reduce")
    public String reduce() {
        System.out.println("减库存");
        return "reduce ok！ " + port;
    }

}
