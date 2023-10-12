package com.spring.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class CheckoutVO {
	private Long orderId;
	private String name;
	private String address;
	private String zip;
	private Date orderDate;
	private int psum;
	
	private String email;
	private boolean emailChk;
	private List<OrderItemVO> orders;
}
