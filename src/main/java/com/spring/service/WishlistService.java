package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.WishlistVO;

public interface WishlistService {
	public void register(WishlistVO vo);
	public WishlistVO get(Long wno);
	public int modify(WishlistVO vo);
	public List<WishlistVO> getList();
	public List<WishlistVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
	public int deleteWishlist(Long wno);
}
