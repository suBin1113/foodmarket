package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.WishlistDTO;
import com.spring.domain.WishlistVO;
import com.spring.mapper.WishlistMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class WishlistServiceImpl implements WishlistService {
	@Autowired
	private WishlistMapper mapper;

	@Override
	public List<WishlistVO> getList() {
		return mapper.getList();
	}

	@Override
	public int wishDelete(Long wno) {
		log.info("remove..." + wno);
		return mapper.delete(wno);
	}

	@Override
	public void insert(WishlistDTO dto) {
		
		
	}

}