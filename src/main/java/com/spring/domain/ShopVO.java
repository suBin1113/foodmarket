package com.spring.domain;

import lombok.Data;

@Data
public class ShopVO {
	private Long pId;
	private String pName;
	private String pKind;
	private String pContent;
	private int pPrice;
	private String pImg;
}
