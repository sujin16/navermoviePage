package kr.or.connect.navermovie.dto;

import java.util.Date;

import lombok.Data;

@Data
public class FileInfo {
	private int id;
	private String fileName;
	private String saveFileName;
	private String contentType;
	private int deleteFlag;
	private Date createDate;
	private Date modifyDate;
}
