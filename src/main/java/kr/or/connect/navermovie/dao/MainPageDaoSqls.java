package kr.or.connect.navermovie.dao;

public class MainPageDaoSqls {
	
	public static final String SELECT_PROMOTION 
	="SELECT file_name  FROM file_info WHERE id IN (SELECTflie_ id FROM product_image WHERE TYPE ='th')" ;
	
	public static final String SELECT_COUNT_BY_CATEGORY 
	="SELECT COUNT(*)  FROM product WHERE category_id = :categoryId";
	
	public static final String SELECT_MAIN_PRODUCT_BY_CATEGORY_ID
	="SELECT product.id AS id, description,content, place_name,save_file_name FROM product, display_info ,product_image, file_info"
	+"WHERE product.id in (SELECT id FROM product WHERE category_id = :categoryId) AND TYPE='ma'"
	+ "AND display_info.product_id = product.id AND product.id = product_image.product_id AND file_info.id = product_image.file_id"
	+"ORDER BY id DESC limit :start, :limit";
	
}
