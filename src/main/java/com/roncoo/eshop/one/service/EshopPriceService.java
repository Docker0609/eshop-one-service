package com.roncoo.eshop.one.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "eshop-price-service")
public interface EshopPriceService {

    @RequestMapping(value = "/product-price/findByProductId",method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "productId") Long productId);

    
    
    

}