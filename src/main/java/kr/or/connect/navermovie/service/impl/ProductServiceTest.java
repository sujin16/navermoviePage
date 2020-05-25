package kr.or.connect.navermovie.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.navermovie.config.ApplicationConfig;
import kr.or.connect.navermovie.service.ProductService;

public class ProductServiceTest {
	public static void main(String[] args) {
		 ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		 ProductService productService = ac.getBean(ProductService.class);
		 
		 int  count = productService.getCount();
		 System.out.println(count);
	}
}
