package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.CartVO;
import com.spring.service.CartService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/foodMarket/*")
public class CartController {
	@Autowired
	private CartService service;

	@GetMapping("/cart")
	public void uploadForm(Model model) {
		model.addAttribute("cart", service.cartList());
	}

	@PostMapping("/delete")
	public String delete(Long cno, RedirectAttributes rttr) {
		log.info("delete..." + cno);
		if (service.delete(cno) == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/foodMarket/cart";
	}
}
