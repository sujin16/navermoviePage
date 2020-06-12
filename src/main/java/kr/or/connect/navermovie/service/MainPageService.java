package kr.or.connect.navermovie.service;

import java.util.List;

import kr.or.connect.navermovie.dto.MainPageVO;
import kr.or.connect.navermovie.dto.FileInfo;

public interface MainPageService {
	public static final Integer LIMIT = 4;
	public List<FileInfo> getPromotions();
	public Integer getCategoryCount(Integer categoryId);
	public List<MainPageVO> getMainProducts(Integer categoryId ,Integer start);
}
