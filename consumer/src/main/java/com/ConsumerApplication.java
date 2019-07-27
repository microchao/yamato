package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@EnableAutoConfiguration
@SpringBootApplication
public class ConsumerApplication {

    @Autowired
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = SpringApplication.run(ConsumerApplication.class, args);
//        context.getBean("dataSource");
    }

}
