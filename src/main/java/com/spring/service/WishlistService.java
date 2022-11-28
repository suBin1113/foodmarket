package com.spring.service;

import java.util.List;

import com.spring.domain.WishlistDTO;
import com.spring.domain.WishlistVO;

public interface WishlistService {
	public List<WishlistVO> getList();
	public int wishDelete(Long wno);
	void insert(WishlistDTO dto);
	
}
