package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.Criteria;
import com.spring.domain.ShopVO;
import com.spring.mapper.ShopMapper;

//import lombok.AllArgsConstructor;

@Service
//@AllArgsConstructor//책에는 있고 실습한 곳에는 없음
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopMapper mapper;
	
	@Override
	public ShopVO get(Long pid) {
		return mapper.read(pid);
	}

	@Override
	public List<ShopVO> getList(Criteria cri) {
		return mapper.getListWithPaging(cri);
	}

	@Override
	public List<ShopVO> getListVege(Criteria cri) {
		return mapper.getListWithPagingVege(cri);
	}

	@Override
	public List<ShopVO> getListFru(Criteria cri) {
		return mapper.getListWithPagingFru(cri);
	}

	@Override
	public List<ShopVO> getListJui(Criteria cri) {
		return mapper.getListWithPagingJui(cri);
	}

	@Override
	public List<ShopVO> getListDri(Criteria cri) {
		return mapper.getListWithPagingDri(cri);
	}

}
