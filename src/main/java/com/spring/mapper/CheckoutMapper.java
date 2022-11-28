package com.spring.mapper;

import java.util.List;

import com.spring.domain.CartVO;
import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;

public interface CheckoutMapper {
	public CheckoutVO read(Long orderId);
	public OrderItemVO readItem(Long orderId);
	public List<OrderItemVO> readOrderList(Long orderId);
	public void insert(CheckoutVO checkout);
	public void itemInsert(OrderItemVO orderItem);
	public void updatePsum(CheckoutVO checkout);
	public int delete(Long orderId);
	public int deleteItem(Long orderId);
	
	//추가부분(작업: 최혜원)
	public List<CartVO> getCart();
	public int cartDelete();
	public Long getOrderId();
}
