package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.WishlistVO;

public interface WishlistService {
	public void register(WishlistVO vo);
	public WishlistVO get(Long pid);
	public int modify(WishlistVO vo);
	public int remove(Long pid);
	public List<WishlistVO> getList();
	public List<WishlistVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
}
