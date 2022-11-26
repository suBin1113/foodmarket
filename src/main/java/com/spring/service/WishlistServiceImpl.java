package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.WishlistVO;
import com.spring.domain.Criteria;
import com.spring.mapper.WishlistMapper;

import jdk.internal.org.jline.utils.Log;

@Service
public class WishlistServiceImpl implements WishlistService {
	@Autowired
	private WishlistMapper mapper;

	@Override
	public List<WishlistVO> getList() {
		return null;
	}

	@Override
	public int deleteWishlist(Long wno) {
		Log.info("remove..." + wno);
		return mapper.delete(wno);
	}

}