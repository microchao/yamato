package com.sxc.dubboservice;

import com.alibaba.dubbo.config.annotation.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrder(int id) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        return map.get(id);
    }
}
