package kr.or.connect.navermovie.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.navermovie.config.ApplicationConfig;
import kr.or.connect.navermovie.service.MainPageService;
import kr.or.connect.navermovie.service.ProductService;
import kr.or.connect.navermovie.dto.FileInfo;
import kr.or.connect.navermovie.dto.MainPageVO;
import java.util.List;

public class ProductServiceTest {
	public static void main(String[] args) {
		 ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		 
//		 ProductService productService = ac.getBean(ProductService.class);
//		 
//		 int  count = productService.getCount();
//		 System.out.println(count);
		 
		 MainPageService mainPageService = ac.getBean(MainPageService.class);
		 
		 int exhibitionCount = mainPageService.getCategoryCount(1);
		 int musicalCount = mainPageService.getCategoryCount(2);
		 int consertCount = mainPageService.getCategoryCount(3);
		 int classicCount = mainPageService.getCategoryCount(4);
		 int theaterCount = mainPageService.getCategoryCount(5);
		
		 System.out.println("exhibitionCount : "+exhibitionCount);
		 System.out.println("musicalCount :  "+musicalCount);
		 System.out.println("consertCount :  "+consertCount);
		 System.out.println("classicCount :  "+classicCount);
		 System.out.println("theaterCount :  "+theaterCount);
		 
		 System.out.println("\n");
		 
		 List<FileInfo> promotions = mainPageService.getPromotions();
		 for (FileInfo element : promotions){
			    System.out.println(element.getFileName());
		 }
		 
		 System.out.println("\n");
		 
		 
		 // error 다시 해보기 query. rowMapper 가 뭔지 다시 봐보기 
		 List<MainPageVO> mainproducts = mainPageService.getMainProducts(1, 1);
		 for (MainPageVO element : mainproducts){
			    System.out.println(element.toString());
		 } 
		 
		 System.out.println("\n");
		 
		 
		 
	}
}
