package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.ShopVO;
import com.spring.mapper.MainMapper;

@Service
public class MainServiceImpl implements MainService{
	@Autowired
	private MainMapper mapper;
	
	@Override
	public List<ShopVO> getList() {
		return mapper.getList();
	}

}
