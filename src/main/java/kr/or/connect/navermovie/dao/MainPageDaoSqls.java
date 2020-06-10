package kr.or.connect.navermovie.dao;

public class MainPageDaoSqls {
	
	public static final String SELECT_COUNT = "SELECT count(*) FROM display_info";
	public static final String SELECT_PAGING = "SELECT * FROM display_info ORDER BY id DESC limit :start, :limit";

	
//	public static final String SELECT_ALL = "SELECT role_id, description FROM role order by role_id";
//	public static final String UPDATE = "UPDATE role SET description = :description WHERE ROLE_ID = :roleId";
//	public static final String SELECT_BY_ROLE_ID = "SELECT role_id, description FROM role where role_id = :roleId";
//	public static final String DELETE_BY_ROLE_ID = "DELETE FROM role WHERE role_id = :roleId";

}
