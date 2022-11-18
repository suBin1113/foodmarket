package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.ShopService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/foodMarket/*")
public class ShopController {
	@Autowired
	private ShopService service;
	
	@GetMapping("/shop")
	public void shop(Model model) {
		log.info("shop form");
		model.addAttribute("shop", service.getList());
	}
	
	@GetMapping("/detail")
	public void detailForm() {
		log.info("detail form");
	}
}
