package kr.or.connect.navermovie.service;

import java.util.List;

import kr.or.connect.navermovie.dto.DisplayInfo;
import kr.or.connect.navermovie.dto.Product;

public interface DisplayInfoService {
	public static final Integer LIMIT = 4;
	public List<DisplayInfo> getProducts(Integer start);
	public int getCount();
	
}
