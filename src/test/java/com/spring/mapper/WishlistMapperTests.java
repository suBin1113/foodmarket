package com.spring.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class WishlistMapperTests {
	@Autowired
	private WishlistMapper mapper;
	
	@Test
	public void testGetshop() {
		log.info("------------");
		mapper.getList();
	}
	
	@Test
	public void testDelete() {
		log.info("------------" + mapper.wishListdelete(2L));
	}
}
