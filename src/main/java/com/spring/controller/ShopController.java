package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/foodMarket/*")
public class ShopController {
	@GetMapping("/shop")
	public void uploadForm() {
		log.info("shop form");
	}
	
	@GetMapping("/detail")
	public void detailForm() {
		log.info("detail form");
	}
}
