package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.domain.WishlistDTO;
import com.spring.service.WishlistService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class WishlistController {
	@Autowired
	private WishlistService service;
	
	@GetMapping("foodMarket/wishlist")
	public void uploadForm(Model model) {
		model.addAttribute("wishlist", service.getList());
	}
	
	@PostMapping("/wishlist/delete")
	public String deleteWishlist(WishlistDTO wish) {
		service.deleteWishlist(wish.getWno());
		
		return "redirect:/wishlist/" + wish.getWno();
	}
}
