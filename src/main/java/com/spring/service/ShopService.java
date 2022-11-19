package com.spring.service;

import java.util.List;

import com.spring.domain.ShopVO;

public interface ShopService {
	public ShopVO get(Long pid);
	public List<ShopVO> getList();
	
	public List<ShopVO> getListVege();
	public List<ShopVO> getListFru();
	public List<ShopVO> getListJui();
	public List<ShopVO> getListDri();
}
