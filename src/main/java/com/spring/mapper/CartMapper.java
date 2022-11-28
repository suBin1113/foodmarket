package com.spring.mapper;

import java.util.List;

import com.spring.domain.CartVO;

public interface CartMapper {

	// 카트 목록 보기
	public List<CartVO> getCart();

	// 삭제
	public int delete(Long cno);
	
	// 카트 물품 개수 조회
	public List<CartVO> getCount();
}
