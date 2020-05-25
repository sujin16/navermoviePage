package kr.or.connect.navermovie.dao;

public class ProductDaoSqls {
	public static final String SELECT_COUNT="SELECT count(*) FROM product";
	public static final String SELECT_PAGING 
	= "SELECT id, category_id, content, description, content, event, create_date, modify_date FROM product ORDER BY id DESC limit :start, :limit";
	
}	
