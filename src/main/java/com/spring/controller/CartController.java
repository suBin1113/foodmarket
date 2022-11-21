package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.google.gson.annotations.Expose;
import com.spring.domain.CartDTO;
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

	@PostMapping("/cart/delete")
	public String deleteCart(CartDTO cart) {
		service.deleteCart(cart.getCno());

		return "redirect:/cart/" + cart.getCno();
	}
}
