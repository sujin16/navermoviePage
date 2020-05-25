package kr.or.connect.navermovie.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.navermovie.dto.Product;
import kr.or.connect.navermovie.service.ProductService;

@RestController
@RequestMapping(path="/products")
public class ProductApiController {
	@Autowired
	ProductService productService;
	
	@GetMapping
	public Map<String, Object> mainpage(@RequestParam(name="start", required=false, defaultValue="0") int start) {
		
		List<Product> list = productService.getProducts(start);
		
		int count = productService.getCount();
		int pageCount = count / ProductService.LIMIT;
		if(count % ProductService.LIMIT > 0)
			pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ProductService.LIMIT);
		}
		
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("count", count);
		map.put("pageStartList", pageStartList);
		
		return map;
	}
	
}
