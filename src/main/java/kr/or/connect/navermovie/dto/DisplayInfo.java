package kr.or.connect.navermovie.dto;

import java.util.Date;

import lombok.Data;

@Data
public class DisplayInfo {
	private int id;
	private int productId;
	private String openingHours;
	private String placeName;
	private String placeLot;
	private String placeStreet;
	private String tel;
	private String homePage;
	private String email;
	private Date createDate;
	private Date modifyDate;
}
