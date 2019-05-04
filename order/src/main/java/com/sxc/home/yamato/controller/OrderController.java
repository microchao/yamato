package com.sxc.home.yamato.controller;

import com.sxc.home.yamato.model.Order;
import com.sxc.home.yamato.service.mybatis.OrderMapper;
import com.sxc.home.yamato.service.repository.OrderRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shenxiaochao on 2019/3/8.
 */
@Controller
@RequestMapping(path="/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;
//
//    @Autowired
//    private OrderMapper orderMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping(path = "/add")
    public String addOrder() {

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");


        Order order = new Order();
        order.setCity("sh");
//        orderMapper.saveOrder(format.format(date),"sh");

        rabbitTemplate.convertAndSend("order","orderKey",format);
        return "success";
    }


    @GetMapping(path = "/index")
    public String index() {

        return "home";
    }

}
