package kr.or.connect.navermovie.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Product {
	private int id;
	private int categoryId;
	private String description;
	private String content;
	private String event;
	private Date createDate;
	private Date modifyDate;
}
