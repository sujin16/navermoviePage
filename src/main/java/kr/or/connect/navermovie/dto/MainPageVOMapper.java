package kr.or.connect.navermovie.dto;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.or.connect.navermovie.dto.MainPageVO;

public class MainPageVOMapper implements RowMapper<MainPageVO>{
	
	@Override
	public MainPageVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		MainPageVO mainPageVO = new MainPageVO();
		
		mainPageVO.setCategoryId(rs.getInt("category_id"));
		mainPageVO.setContent(rs.getString("content"));
		mainPageVO.setDescription(rs.getString("description"));
		mainPageVO.setPlaceName(rs.getString("place_name"));
		
		return mainPageVO;
	}
}


