package com.spring.service;

import java.util.List;

import com.spring.domain.CartVO;
import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;

public interface CheckoutService {
	public void register(CheckoutVO checkout);
	public void registerItem(OrderItemVO orderItem);
	public void updatePsum(CheckoutVO checkout);
	public CheckoutVO get(Long orderId);
	public List<OrderItemVO> getOrderList(Long orderId);
	public int remove(Long orderId);
	public int removeItem(Long orderId);
	
	//추가부분(작업: 최혜원)
	public List<CartVO> getCartList();
	public int cartDelete();
	public Long getOrderId();
}
