package com.spring.domain;

import java.util.List;

import lombok.Data;

@Data
public class OrderItemVO {
	private Long orderId;
	private int pid;
	private String pname;
	private int pcount;
	private int pprice;
	private String pimg;
	private int totalPrice;
}
