package com.sxc.home.yamato.controller;

import com.sxc.home.yamato.model.Order;
import com.sxc.home.yamato.service.mybatis.OrderMapper;
import com.sxc.home.yamato.service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by shenxiaochao on 2019/3/8.
 */
@Controller
@RequestMapping(path="/order")
public class OrderController {
//
    /*@Autowired
    private OrderRepository orderRepository;*/



    @GetMapping(path="/add")
    public String addOrder() {
        Order order = new Order();
        order.setName("aa");
//        orderMapper.findOrder(1);
        return "success";
    }

}
