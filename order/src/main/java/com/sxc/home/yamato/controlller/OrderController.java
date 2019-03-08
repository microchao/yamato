package com.sxc.home.yamato.controlller;

import com.sxc.home.yamato.model.Order;
import com.sxc.home.yamato.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by shenxiaochao on 2019/3/8.
 */
@Controller
@RequestMapping(path="/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addOrder(HttpServletRequest request) {
        Order order = new Order();
        order.setName("aa");
        orderRepository.save(order);
        return "success";
    }

}
