package kr.or.connect.navermovie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.navermovie.dao.ProductDao;
import kr.or.connect.navermovie.dto.Product;
import kr.or.connect.navermovie.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao productDao;
	
	@Override
	@Transactional //read only로 connection 이 됨
	public List<Product> getProducts(Integer start) {
		List<Product>  products =productDao.selectAll(start, LIMIT);
		return products;
	}


	@Override
	public int getCount() {
		return productDao.selectCount();
	}
	
}
