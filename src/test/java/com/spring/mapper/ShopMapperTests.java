package com.spring.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.Criteria;
import com.spring.domain.ShopVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ShopMapperTests {
	@Autowired
	private ShopMapper mapper;
	
	@Test
	public void testGetshop() {
		log.info("------------");
		mapper.getList();
	}
	@Test
	public void testread() {
		log.info("------------");
		log.info(mapper.read(1l));
	}
	@Test
	public void testGetvege() {
		log.info("------------");
		mapper.getListVege();
	}
	@Test
	public void testGetfru() {
		log.info("------------");
		mapper.getListFru();
	}
	@Test
	public void testGetjui() {
		log.info("------------");
		mapper.getListJui();
	}
	@Test
	public void testGetdri() {
		log.info("------------");
		mapper.getListDri();
	}
	
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
		List<ShopVO> list = mapper.getListWithPaging(cri);
		list.forEach(shop -> log.info(shop));
	}
	@Test
	public void testPagingV() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
		List<ShopVO> list = mapper.getListWithPagingVege(cri);
		list.forEach(shop -> log.info(shop));
	}
	@Test
	public void testPagingF() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
		List<ShopVO> list = mapper.getListWithPagingFru(cri);
		list.forEach(shop -> log.info(shop));
	}
	@Test
	public void testPagingJ() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
		List<ShopVO> list = mapper.getListWithPagingJui(cri);
		list.forEach(shop -> log.info(shop));
	}
	@Test
	public void testPagingD() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
		List<ShopVO> list = mapper.getListWithPagingDri(cri);
		list.forEach(shop -> log.info(shop));
	}
	@Test
	public void testInsert() {
		ShopVO shop = new ShopVO();
		shop.setPid(61L);
		shop.setPname("이름1");
		shop.setPprice(100);
		shop.setPcontent("테스트 내용");
		shop.setPimg("product-1.jpg");
		
		mapper.insert(shop);
		log.info(shop);
	}
}
