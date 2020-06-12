package kr.or.connect.navermovie.dao;

public class DisplayInfoDaoSqls {
	public static final String SELECT_COUNT = "SELECT count(*) FROM display_info";
	public static final String SELECT_PAGING = "SELECT * FROM display_info ORDER BY id DESC limit :start, :limit";
	
}	
