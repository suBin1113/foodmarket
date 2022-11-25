package com.spring.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CheckoutMapperTests {
	@Autowired
	CheckoutMapper mapper;
	
	@Test
	public void testInsert() {
		CheckoutVO checkout = new CheckoutVO();
		checkout.setOrderId(1L);
		checkout.setName("김주현");
		checkout.setAddress("대구");
		checkout.setZip("12345");
		checkout.setPsum(10000);
		mapper.insert(checkout);
		log.info("==================testInsert: " + checkout.getOrderId());
	}
	
	@Test
	public void testRead() {
		CheckoutVO checkout = mapper.read(71L);
		log.info(checkout);
	}
	
	@Test
	public void testReadOrderList() {
		mapper.readOrderList(1L);
	}
	
	@Test
	public void testDelete() {
		int count = mapper.delete(71L);
		log.info("==================testDelete: " + count);
	}

}
