package com.sxc.home.yamato;

import com.sxc.home.yamato.service.mybatis.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@SpringBootApplication(scanBasePackages = "com.sxc.home.yamato.service.mybatis.*")
@SpringBootApplication
//@EnableWebMvc
//@EnableJpaRepositories
public class OrderApplication {

//	@Autowired
//	private OrderMapper orderMapper;

//	OrderApplication(OrderMapper orderMapper) {
//		this.orderMapper = orderMapper;
//	}

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);


	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(this.orderMapper.findOrder(1));
//	}
}
