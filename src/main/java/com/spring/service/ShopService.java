package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.ShopVO;
import com.spring.domain.WishlistVO;

public interface ShopService {
	public ShopVO get(Long pid);
	public List<ShopVO> getList(Criteria cri);
	
	public List<ShopVO> getListVege(Criteria cri);
	public List<ShopVO> getListFru(Criteria cri);
	public List<ShopVO> getListJui(Criteria cri);
	public List<ShopVO> getListDri(Criteria cri);
	
	public int getTotal(Criteria cri);
	public int getTotalVege(Criteria cri);
	public int getTotalFru(Criteria cri);
	public int getTotalJui(Criteria cri);
	public int getTotalDri(Criteria cri);
	
	public void insert(ShopVO shop);
	public void insertWish(WishlistVO wish);
	public List<Long> getWishListPid();
	public int eqWishPid(Long pid);
}
