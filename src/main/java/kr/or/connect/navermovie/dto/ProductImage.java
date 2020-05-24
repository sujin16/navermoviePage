package kr.or.connect.navermovie.dto;

import lombok.Data;

@Data
public class ProductImage {
	private int id;
	private int productId;
	private String type;
	private int fileId;
	
}
