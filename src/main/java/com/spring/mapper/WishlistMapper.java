package com.spring.mapper;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.WishlistVO;

public interface WishlistMapper {
	public List<WishlistVO> getList();
	public List<WishlistVO> getListWithPaging(Criteria cri);
	public void insert(WishlistVO board);
	public void insertSelectKey(WishlistVO board);
	public WishlistVO read(Long wno);
	public int delete(Long wno);
	public int update(WishlistVO board);
	public int getTotalCount(Criteria cri);
}
