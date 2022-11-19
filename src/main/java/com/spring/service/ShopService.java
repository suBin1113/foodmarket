package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.ShopVO;

public interface ShopService {
	public ShopVO get(Long pid);
	public List<ShopVO> getList(Criteria cri);
	public List<ShopVO> getList();
	
	public List<ShopVO> getListVege(Criteria cri);
	public List<ShopVO> getListFru(Criteria cri);
	public List<ShopVO> getListJui(Criteria cri);
	public List<ShopVO> getListDri(Criteria cri);
}
