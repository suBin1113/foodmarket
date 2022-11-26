package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.WishlistVO;

public interface WishlistService {
	public List<WishlistVO> getList();
	public int deleteWishlist(Long wno);
}
