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
public class CartMapperTests {
	@Autowired
	private CartMapper mapper;

	@Test
	public void testGetCart() {
		log.info("------------");
		mapper.getCart();
	}

	@Test
	public void testDeleteCart() {
		log.info("DELETE COUNT: " + mapper.delete(118L));
	}

	@Test
	public void testgetCount() {
		log.info("------------");
		mapper.getCount();
	}
}
