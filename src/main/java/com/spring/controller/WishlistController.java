package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.spring.service.WishlistService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/foodMarket/*")
public class WishlistController {
	@Autowired
	private WishlistService service;

	@GetMapping("/wishlist")
	public void uploadForm(Model model) {
		model.addAttribute("wishlist", service.getList());
	}

	//url 주소 수정
	@PostMapping("/wishListdelete")
	public String wishListdelete(Long wno, RedirectAttributes rttr) {
		log.info("delete..." + wno);
		if (service.wishListdelete(wno) == 1) {
			rttr.addFlashAttribute("result", "success");
		}

		return "redirect:foodMarket/wishlist";
	}
}
