package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sxc.dubboservice.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/consumer")
public class ConsumerController {

    @Reference
    OrderService orderService;

    @GetMapping(path = "/index")
    public String index() {
        System.out.println(orderService.getOrder(1));
        return "success";
    }
}
