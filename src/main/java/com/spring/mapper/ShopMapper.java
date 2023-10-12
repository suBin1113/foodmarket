package com.spring.mapper;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.ShopVO;
import com.spring.domain.WishlistVO;

public interface ShopMapper {
	public List<ShopVO> getList();
	public ShopVO read(Long pid);

	public List<ShopVO> getListVege();
	public List<ShopVO> getListFru();
	public List<ShopVO> getListJui();
	public List<ShopVO> getListDri();
	
	public List<ShopVO> getListWithPaging(Criteria cri);
	
	public List<ShopVO> getListWithPagingVege(Criteria cri);
	public List<ShopVO> getListWithPagingFru(Criteria cri);
	public List<ShopVO> getListWithPagingJui(Criteria cri);
	public List<ShopVO> getListWithPagingDri(Criteria cri);
	
	public int getTotalCount(Criteria cri);
	public int getTotalCountVege(Criteria cri);
	public int getTotalCountFru(Criteria cri);
	public int getTotalCountJui(Criteria cri);
	public int getTotalCountDri(Criteria cri);
	
	public void insert(ShopVO shop);
	public void insertSelectKey(ShopVO shop);
	
	public void insertWish(WishlistVO wish);
	public void insertSelectKeyWish(WishlistVO wish);
	public List<Long> getWishListPid();
}