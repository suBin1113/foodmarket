package com.spring.mapper;

import java.util.List;

import com.spring.domain.WishlistVO;
public interface WishlistMapper {
	public List<WishlistVO> getList();
	public int wishListdelete(Long wno);
}
