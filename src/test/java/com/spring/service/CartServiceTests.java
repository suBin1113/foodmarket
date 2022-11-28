package com.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.CartVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CartServiceTests {
	@Autowired
	private CartService service;

	@Test
	public void testDelete() {
		// 게시물 번호 존재 여부 확인하고 테스트
		log.info("REMOVE RESULE: " + service.delete(61L));
	}

	@Test
	public void testGetCount() {
		log.info(service.getCount());
	}
}
