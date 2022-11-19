package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.CartVO;
import com.spring.mapper.CartMapper;

@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper mapper;

	@Override
	public List<CartVO> cartList() {
		return mapper.getCart();
	}
}
