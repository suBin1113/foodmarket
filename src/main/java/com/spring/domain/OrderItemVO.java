package com.spring.domain;

import lombok.Data;

@Data
public class OrderItemVO {
	private int orderId;
	private int orderItemId;
	private int pid;
	private String pname;
	private int pcount;
	private int pprice;
	private int totalPrice;
}
