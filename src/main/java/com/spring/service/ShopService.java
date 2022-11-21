package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.ShopVO;

public interface ShopService {
	public ShopVO get(Long pid);
<<<<<<< HEAD
	public List<ShopVO> getList(Criteria cri);
	
	public List<ShopVO> getListVege(Criteria cri);
	public List<ShopVO> getListFru(Criteria cri);
	public List<ShopVO> getListJui(Criteria cri);
	public List<ShopVO> getListDri(Criteria cri);
=======
	public List<ShopVO> getList();
>>>>>>> parent of e33c9e2 (종류 분류 추가)
}
