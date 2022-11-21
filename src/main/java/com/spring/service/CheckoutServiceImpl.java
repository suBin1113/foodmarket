package com.spring.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;
import com.spring.mapper.CheckoutMapper;

@Service
public class CheckoutServiceImpl implements CheckoutService {
	@Autowired
	CheckoutMapper mapper;

	@Override
	public void register(CheckoutVO checkout) {
		List<OrderItemVO> orders = new ArrayList<>();
		for(OrderItemVO item : checkout.getOrders()) {
			OrderItemVO orderItem = mapper.readItem(item.getPid());
			orderItem.setPcount(item.getPcount());
			orders.add(orderItem);
		}
		
		checkout.setOrders(orders);
		Date orderDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		checkout.setOrderDate(orderDate);
		mapper.insert(checkout);
		for(OrderItemVO item : checkout.getOrders()) {
			item.setOrderId(checkout.getOrderId());
			mapper.itemInsert(item);
		}
	}

	@Override
	public CheckoutVO get(int orderId) {
		return mapper.read(orderId);
	}

	@Override
	public int remove(int orderId) {
		return mapper.delete(orderId);
	}

	@Override
	public List<OrderItemVO> getOrderList(int orderId) {
		return mapper.readOrderList(orderId);
	}
	
	
}
