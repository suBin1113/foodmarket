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
		//List<OrderItemVO> orders = new ArrayList<>();
		mapper.insert(checkout);
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
	public List<OrderItemVO> getOrderList(Long orderId) {
		return mapper.readOrderList(orderId);
	}
	
	
}
