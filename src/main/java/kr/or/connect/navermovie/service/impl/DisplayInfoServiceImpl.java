package kr.or.connect.navermovie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.navermovie.dao.DisplayInfoDao;
import kr.or.connect.navermovie.dto.DisplayInfo;
import kr.or.connect.navermovie.service.DisplayInfoService;

@Service
public class DisplayInfoServiceImpl implements DisplayInfoService{
	
	@Autowired
	DisplayInfoDao displayInfoDao;
	
	@Override
	@Transactional //read only로 connection 이 됨
	public List<DisplayInfo> getProducts(Integer start) {
		List<DisplayInfo>  products =displayInfoDao.selectAll(start, LIMIT);
		return products;
	}


	@Override
	public int getCount() {
		return displayInfoDao.selectCount();
	}
	
}
