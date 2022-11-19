package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.domain.Criteria;
import com.spring.service.ShopService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/foodMarket/*")
public class ShopController {
	@Autowired
	private ShopService service;
	
	@GetMapping("/shop")
	public void shop(Criteria cri, Model model) {
		log.info("shop form");
		model.addAttribute("shop", service.getList(cri));
	}
	
	@GetMapping("/detail")
	public void detailForm(@RequestParam("pid") Long pid, Model model) {
		log.info("detail form");
		model.addAttribute("product", service.get(pid));
	}
	
	@GetMapping("/shop_vegetable")
	public void vegetable(Criteria cri, Model model) {
		log.info("vegetable form");
		model.addAttribute("shop_vege", service.getListVege(cri));
	}

	@GetMapping("/shop_fruit")
	public void fruit(Criteria cri, Model model) {
		log.info("fruit form");
		model.addAttribute("shop_fru", service.getListFru(cri));
	}
	
	@GetMapping("/shop_juice")
	public void juice(Criteria cri, Model model) {
		log.info("juice form");
		model.addAttribute("shop_jui", service.getListJui(cri));
	}
	
	@GetMapping("/shop_dried")
	public void dried(Criteria cri, Model model) {
		log.info("dried form");
		model.addAttribute("shop_dri", service.getListDri(cri));
	}
}
