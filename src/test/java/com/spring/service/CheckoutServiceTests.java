package com.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.CartVO;
import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CheckoutServiceTests {
	@Autowired
	private CheckoutService service;
	
	@Test
	public void testRegister() {
		CheckoutVO checkout = new CheckoutVO();
		checkout.setOrderId(1L);
		checkout.setName("김주현");
		checkout.setAddress("대구");
		checkout.setZip("12345");
		checkout.setPsum(10000);
		service.register(checkout);
		log.info("testRegister: " + checkout.getOrderId());
	}
	
	@Test
	public void testGet() {
		CheckoutVO checkout = new CheckoutVO();
		checkout.setOrderId(72L);
		log.info("testGet: " + service.get(checkout.getOrderId()));
	}
	
	@Test
	public void testRemove() {
		CheckoutVO checkout = new CheckoutVO();
		checkout.setOrderId(72L);
		log.info("testRemove: " + service.remove(checkout.getOrderId()));
	}
	
	@Test
	public void testGetCart() {
		//CartVO cart = new CartVO();
		service.getCartList();
	}
	
	@Test
	public void testGetOrderId() {
		log.info(service.getOrderId());
	}
	
	@Test
	public void testDeleteCart() {
		log.info(service.cartDelete());
	}
}
