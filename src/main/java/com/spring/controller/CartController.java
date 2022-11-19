package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.service.CartService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CartController {
	@Autowired
	private CartService service;
	
	@GetMapping("foodMarket/cart")
	public void uploadForm(Model model) {
		model.addAttribute("cart", service.cartList());
	}
}
