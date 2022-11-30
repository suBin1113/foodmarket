package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.CartVO;
import com.spring.mapper.CartMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class CartServiceImpl implements CartService {
	@Autowired
	private CartMapper mapper;

	@Override
	public List<CartVO> cartList() {
		return mapper.getCart();
	}

	@Override
	public int delete(Long cno) {
		log.info("remove..." + cno);
		return mapper.delete(cno);
	}

	@Override
	public int getCount(CartVO vo) throws Exception {
		log.info("getCount...");
		return mapper.getCount();
	}

}
