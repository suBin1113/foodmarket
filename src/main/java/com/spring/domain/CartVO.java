package com.spring.domain;

import lombok.Data;

@Data
public class CartVO {
	private Long cno; //순서
	private int pid; //상품 id
	private String pname; //상품 이름
	private int pprice; //상품 개별 가격
	private String pcontent; //상품 내용
	private String pimg; //상품 이미지
	private int pcount; //상품 개별 갯수
	
	private int totalCnt; //상품 총 갯수
}
