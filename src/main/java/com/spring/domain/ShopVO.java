package com.spring.domain;

import lombok.Data;

@Data
public class ShopVO {
	private Long pid;
	private String pname;
	private String pkind;
	private String pcontent;
	private int pprice;
	private String pimg;
	private Long cno;
	private int count;
}
