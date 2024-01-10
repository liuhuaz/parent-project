package com.lnsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName WarehouseController
 * @Dscription TDO
 * @Author huazh
 * @Date 2024/1/10 16:23
 **/
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @RequestMapping("/queryWarehouse")
    public String queryWarehouse(){
        return "-----warehouse is null ------";
    }
}
