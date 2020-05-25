package kr.or.connect.navermovie.service;

import java.util.List;

import kr.or.connect.navermovie.dto.Product;

public interface ProductService {
	public static final Integer LIMIT = 4;
	public List<Product> getProducts(Integer start);
	public int getCount();
	
}
