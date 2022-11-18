package com.spring.mapper;

import java.util.List;

import com.spring.domain.ShopVO;

public interface ShopMapper {
	public List<ShopVO> getList();
	public ShopVO read(Long pid);
}