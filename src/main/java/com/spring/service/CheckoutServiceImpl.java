package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.CartVO;
import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;
import com.spring.mapper.CheckoutMapper;

@Service
public class CheckoutServiceImpl implements CheckoutService {
	@Autowired
	CheckoutMapper mapper;

	@Override
	public void register(CheckoutVO checkout) {
		mapper.insert(checkout);
	}
	
	@Override
	public void registerItem(OrderItemVO orderItem) {
		mapper.itemInsert(orderItem);
	}

	@Override
	public void updatePsum(CheckoutVO checkout) {
		mapper.updatePsum(checkout);
	}
	
	@Override
	public CheckoutVO get(Long orderId) {
		return mapper.read(orderId);
	}

	@Override
	public int remove(Long orderId) {
		return mapper.delete(orderId);
	}
	
	@Override
	public int removeItem(Long orderId) {
		return mapper.deleteItem(orderId);
	}

	@Override
	public List<OrderItemVO> getOrderList(Long orderId) {
		return mapper.readOrderList(orderId);
	}

	@Override
	public List<CartVO> getCartList() {
		return mapper.getCart();
	}

	@Override
	public int cartDelete() {
		return mapper.cartDelete();
	}

	@Override
	public Long getOrderId() {
		return mapper.getOrderId();
	}

}
