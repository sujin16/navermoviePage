package kr.or.connect.navermovie.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.connect.navermovie.dto.Product;
import kr.or.connect.navermovie.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;	
	
	@GetMapping(path="/mainpage")
	public String mainpage(@RequestParam(name="start", required=false, defaultValue="0") int start,
					   ModelMap model) {
		
		// start로 시작하는 방명록 목록 구하기
		List<Product> list = productService.getProducts(start);
		
		// 전체 페이지수 구하기
		int count = productService.getCount();
		int pageCount = count / productService.LIMIT;
		if(count % productService.LIMIT > 0)
			pageCount++;
		
		// 페이지 수만큼 start의 값을 리스트로 저장
		// 예를 들면 페이지수가 3이면
		// 0, 5, 10 이렇게 저장된다.
		// list?start=0 , list?start=5, list?start=10 으로 링크가 걸린다.
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * productService.LIMIT);
		}
		
		//jsp에 사용하기 위해 
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
		
		return "mainpage";
	}

}
