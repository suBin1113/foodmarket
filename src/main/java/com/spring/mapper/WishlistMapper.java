package com.spring.mapper;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.WishlistVO;

public interface WishlistMapper {
	public List<WishlistVO> getList();
	public int delete(Long wno);
}
