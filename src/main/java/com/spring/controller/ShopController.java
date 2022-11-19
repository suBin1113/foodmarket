package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public void detailForm(@RequestParam("pid") Long pid, Model model) {
		log.info("detail form");
		model.addAttribute("product", service.get(pid));
	}
	
	@GetMapping("/shop_vegetable")
	public void vegetable(Model model) {
		log.info("vegetable form");
		model.addAttribute("shop_vege", service.getListVege());
	}

	@GetMapping("/shop_fruit")
	public void fruit(Model model) {
		log.info("fruit form");
		model.addAttribute("shop_fru", service.getListFru());
	}
	
	@GetMapping("/shop_juice")
	public void juice(Model model) {
		log.info("juice form");
		model.addAttribute("shop_jui", service.getListJui());
	}
	
	@GetMapping("/shop_dried")
	public void dried(Model model) {
		log.info("dried form");
		model.addAttribute("shop_dri", service.getListDri());
	}
}
