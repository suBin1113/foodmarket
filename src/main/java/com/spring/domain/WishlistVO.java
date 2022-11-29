package com.spring.domain;

import lombok.Data;

@Data
public class WishlistVO {
	private Long wno;
	private Long pid;
	private String pname;
	private int pprice;
	private String pcontent;
	private String pimg;
}
