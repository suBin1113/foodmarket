package com.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.Criteria;
import com.spring.domain.ShopVO;
import com.spring.domain.WishlistVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ShopServiceTests {
	@Autowired
	private ShopService service;
	
	@Test
	public void testGetList() {
		service.getList(new Criteria(1, 10)).forEach(shop -> log.info(shop));
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1L));
	}
	
	@Test
	public void testGetListVege() {
		service.getListVege(new Criteria(2, 10)).forEach(shop_vege -> log.info(shop_vege));
	}
	@Test
	public void testGetListFru() {
		service.getListFru(new Criteria(1, 10)).forEach(shop_fru -> log.info(shop_fru));
	}
	@Test
	public void testGetListJui() {
		service.getListJui(new Criteria(2, 10)).forEach(shop_jui -> log.info(shop_jui));
	}
	@Test
	public void testGetListDri() {
		service.getListDri(new Criteria(2, 10)).forEach(shop_dri -> log.info(shop_dri));
	}
	@Test
	public void testInsert() {
		ShopVO shop = new ShopVO();
		shop.setPid(61L);
		shop.setPname("이름1");
		shop.setPprice(100);
		shop.setPcontent("테스트 내용");
		shop.setPimg("product-1.jpg");
		shop.setCount(5);
		
		service.insert(shop);
	}
	
	@Test
	public void testInsertWish() {
		WishlistVO wish = new WishlistVO();
		wish.setPid(61L);
		wish.setPname("이름1");
		wish.setPprice(100);
		wish.setPcontent("테스트 내용");
		wish.setPimg("product-1.jpg");
		
		service.insertWish(wish);
	}
	@Test
	public void testGetWishList() {
		service.getWishListPid();
	}
	@Test
	public void testeq() {
		log.info("result--------------------" + service.eqWishPid(82L));
	}
}
