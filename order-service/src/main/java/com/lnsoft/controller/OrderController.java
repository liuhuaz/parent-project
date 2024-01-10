package com.lnsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Dscription TDO
 * @Author huazh
 * @Date 2024/1/10 16:19
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/queryOrder")
    public String queryOrder(){
        return "---order is null --------";
    }

}
