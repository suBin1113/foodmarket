package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CheckoutController {
	@GetMapping("foodMarket/checkout")
	public void uploadForm() {
		log.info("checkout form");
	}
}