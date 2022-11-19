package com.spring.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class CheckoutVO {
	private int orderId;
	private String name;
	private String address;
	private String zip;
	private Date orderDate;
	private int psum;
	
	private List<OrderItemVO> orders;
}
