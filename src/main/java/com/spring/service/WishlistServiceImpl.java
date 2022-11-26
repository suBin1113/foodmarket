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
	public void register(WishlistVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WishlistVO get(Long wno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modify(WishlistVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<WishlistVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WishlistVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}

	public WishlistMapper getMapper() {
		return mapper;
	}

	public void setMapper(WishlistMapper mapper) {
		this.mapper = mapper;
	}


	@Override
	public int deleteWishlist(Long wno) {
		Log.info("remove..." + wno);
		return mapper.delete(wno);
	}

}