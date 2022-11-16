package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CartController {
	@GetMapping("foodMarket/cart")
	public void uploadForm() {
		log.info("cart form");
	}
}
