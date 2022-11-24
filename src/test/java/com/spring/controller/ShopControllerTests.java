package com.spring.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j
public class ShopControllerTests {
	@Autowired
	private WebApplicationContext ctx;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testList() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/foodMarket/shop")).andReturn().getModelAndView().getModelMap());
	}
	@Test
	public void testGet() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/foodMarket/detail").param("pid", "1")).andReturn()
				.getModelAndView().getModelMap());
	}
	
	@Test
	public void testListPaging() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/foodMarket/shop").param("pageNum", "2").param("amount", "10"))
				.andReturn()
				.getModelAndView().getModelMap());
	}
	
	@Test
	public void testInsert() throws Exception {
		String result = mockMvc.perform(MockMvcRequestBuilders.post("/foodMarket/addCart")
				.param("pid", "61")
				.param("pname", "이름1")
				.param("pprice", "100")
				.param("pcontent", "테스트 내용1")
				.param("pimg", "product-1.jpg"))
				.andReturn()
				.getModelAndView()
				.getViewName();
		
		log.info("-----------------------------"+ result);
	}
}
