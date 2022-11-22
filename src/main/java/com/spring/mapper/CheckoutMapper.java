package com.spring.mapper;

import java.util.List;

import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;

public interface CheckoutMapper {
	public CheckoutVO read(Long orderId);
	public OrderItemVO readItem(int pid);
	public List<OrderItemVO> readOrderList(Long orderId);
	public void insert(CheckoutVO checkout);
	public void itemInsert(OrderItemVO orderItem);
	public int delete(Long orderId);
}
