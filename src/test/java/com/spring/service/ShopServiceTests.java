package com.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ShopServiceTests {
	@Autowired
	private ShopService service;
	
	@Test
	public void testGetList() {
		service.getList().forEach(shop -> log.info(shop));
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1L));
	}
	
	@Test
	public void testGetListVege() {
		service.getListVege().forEach(shop_vege -> log.info(shop_vege));
	}
	@Test
	public void testGetListFru() {
		service.getListFru().forEach(shop_fru -> log.info(shop_fru));
	}
	@Test
	public void testGetListJui() {
		service.getListJui().forEach(shop_jui -> log.info(shop_jui));
	}
	@Test
	public void testGetListDri() {
		service.getListDri().forEach(shop_dri -> log.info(shop_dri));
	}
}
