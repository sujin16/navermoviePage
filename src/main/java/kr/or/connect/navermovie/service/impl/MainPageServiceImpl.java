package kr.or.connect.navermovie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.connect.navermovie.dao.MainPageDao;
import kr.or.connect.navermovie.dto.FileInfo;
import kr.or.connect.navermovie.dto.MainPageVO;
import kr.or.connect.navermovie.service.MainPageService;


@Service
public class MainPageServiceImpl implements MainPageService{
	
	@Autowired
	MainPageDao mainPageDao;
	
	@Override
	public List<FileInfo> getPromotions() {
		// TODO Auto-generated method stub
		List<FileInfo>  promotions = mainPageDao.selectPromotions();
		return promotions;
	}
	
	@Override
	public Integer getCategoryCount(Integer categoryId) {
		return mainPageDao.selectCategoryCount(categoryId);
	}
	
	@Override
	public List<MainPageVO> getMainProducts(Integer categoryId ,Integer start) {
		List<MainPageVO>  mainproducts = mainPageDao.selectMainProduct(categoryId, start, LIMIT);
		return mainproducts;
	}

	
}
