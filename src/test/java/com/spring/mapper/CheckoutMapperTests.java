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
		List<OrderItemVO> orders = new ArrayList<>();
		OrderItemVO orderItem = new OrderItemVO();
		
		orderItem.setOrderId(1L);
		orderItem.setPid(1);
		orderItem.setPcount(1);
		orderItem.setPprice(1000);
		orderItem.setTotalPrice(1000);
		
		orders.add(orderItem);
		
		checkout.setOrderId(1L);
		checkout.setName("김주현");
		checkout.setAddress("대구");
		checkout.setZip("12345");
		checkout.setPsum(10000);
		checkout.setOrders(orders);
		mapper.insert(checkout);
		log.info("==================testInsert: " + checkout.getOrderId());
	}
	
	@Test
	public void testRead() {
		CheckoutVO checkout = mapper.read(1L);
		log.info(checkout);
	}
	
	@Test
	public void testReadOrderList() {
		mapper.readOrderList(1L);
	}
	
	@Test
	public void testDelete() {
		int count = mapper.delete(1L);
		log.info("==================testDelete: " + count);
	}
	
	@Test
	public void testItemInsert() {
		OrderItemVO orderItem = new OrderItemVO();
		orderItem.setOrderId(1L);
		orderItem.setOrderItemId(1);
		orderItem.setPid(1);
		orderItem.setPcount(1);
		orderItem.setPprice(1000);
		orderItem.setTotalPrice(1000);
		mapper.itemInsert(orderItem);
		log.info("==================testItemInsert: " + orderItem.getOrderId());
	}
}
