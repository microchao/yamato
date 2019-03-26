package com.sxc.home.yamato;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class OrderApplicationTests {

//	@Test
//	public void contextLoads() {
//
//
//	}


	public static void main(String[] args) {

		Resource resource = new ClassPathResource("jsp/home.jsp");
		System.out.println(resource.isReadable());
	}
}
