package com.spring.mapper;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.ShopVO;

public interface ShopMapper {
	public List<ShopVO> getList();
	public ShopVO read(Long pid);
<<<<<<< HEAD
	
	public List<ShopVO> getListVege();
	public List<ShopVO> getListFru();
	public List<ShopVO> getListJui();
	public List<ShopVO> getListDri();
	
	public List<ShopVO> getListWithPaging(Criteria cri);
	
	public List<ShopVO> getListWithPagingVege(Criteria cri);
	public List<ShopVO> getListWithPagingFru(Criteria cri);
	public List<ShopVO> getListWithPagingJui(Criteria cri);
	public List<ShopVO> getListWithPagingDri(Criteria cri);
=======
>>>>>>> parent of e33c9e2 (종류 분류 추가)
}