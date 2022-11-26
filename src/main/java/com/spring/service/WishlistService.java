package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.WishlistVO;

public interface WishlistService {
	public int modify(WishlistVO vo);
	public List<WishlistVO> getList();
	public int getTotal(Criteria cri);
	public int deleteWishlist(Long wno);
}
