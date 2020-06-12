package kr.or.connect.navermovie.dto;

import lombok.Data;

@Data
public class MainPageVO {
	//category_id, description,content, place_name,save_file_name
	private int categoryId;
	private String description;
	private String content;
	private String placeName;
	private String saveFileName;
	
}
