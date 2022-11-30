package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.service.MainService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class MainController {
	@Autowired
	private MainService service;
	
	@GetMapping("foodMarket/main")
	public void mainForm(Model model) {
		log.info("main form");
		model.addAttribute("productList", service.getList());
	}
	
	@GetMapping("/foodMarket/about")
	public void aboutForm() {
		
	}
	
}
