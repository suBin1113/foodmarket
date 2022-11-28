package com.spring.service;

import java.util.List;

import com.spring.domain.CartVO;

public interface CartService {
	// 장바구니 목록 조회
	public List<CartVO> cartList();

	// 장바구니 품목 삭제
	public int delete(Long cno);

	// 카트 물품 개수 조회
	public int getCount();
}
