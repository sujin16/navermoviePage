package kr.or.connect.navermovie.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.connect.navermovie.dto.Product;
import kr.or.connect.navermovie.dto.FileInfo;
import kr.or.connect.navermovie.dto.MainPageVO;
import kr.or.connect.navermovie.dto.MainPageVOMapper;

import static kr.or.connect.navermovie.dao.MainPageDaoSqls.*;
@Repository
public class MainPageDao {
	
	private NamedParameterJdbcTemplate jdbc;
	
	private RowMapper<FileInfo> rowFileInfoMapper = BeanPropertyRowMapper.newInstance(FileInfo.class);
	
	public MainPageDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	/*
	 * public List<Product> selectAll(Integer start, Integer limit) { Map<String,
	 * Integer> params = new HashMap<>(); params.put("start", start);
	 * params.put("limit", limit); return jdbc.query(SELECT_PAGING, params,
	 * rowMapper); }
	 * 
	 * public Long insert(Guestbook guestbook) { SqlParameterSource params = new
	 * BeanPropertySqlParameterSource(guestbook); return
	 * insertAction.executeAndReturnKey(params).longValue(); }
	 * 
	 * public int deleteById(Long id) { Map<String, ?> params =
	 * Collections.singletonMap("id", id); return jdbc.update(DELETE_BY_ID, params);
	 * }
	 */
	
	public List<FileInfo> selectPromotions() {
		return jdbc.query(SELECT_PROMOTION, rowFileInfoMapper);
	}
	
	public int selectCategoryCount(Integer id) {
		Map<String, ?> params = Collections.singletonMap("categoryId", id);
		return jdbc.queryForObject(SELECT_COUNT_BY_CATEGORY, params, Integer.class);
	}
	
	public List<MainPageVO> selectMainProduct (Integer id, Integer start, Integer limit){
		Map<String, Integer> params = new HashMap<>();
		params.put("categoryId", id);
		params.put("start", start);
		params.put("limit", limit);
	
		return jdbc.query(SELECT_MAIN_PRODUCT_BY_CATEGORY_ID, params, new MainPageVOMapper());
	}

}
