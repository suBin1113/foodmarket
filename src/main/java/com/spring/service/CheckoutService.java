package com.spring.service;

import java.util.List;

import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;

public interface CheckoutService {
	public void register(CheckoutVO checkout);
	public CheckoutVO get(Long orderId);
	public List<OrderItemVO> getOrderList(Long orderId);
	public int remove(Long orderId);
}
