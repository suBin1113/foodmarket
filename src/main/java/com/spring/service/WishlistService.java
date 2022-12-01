package com.spring.service;

import java.util.List;

import com.spring.domain.WishlistVO;

public interface WishlistService {
	public List<WishlistVO> getList();
	public int wishListdelete(Long wno);
	public void insert(WishlistVO wno);
	
}
