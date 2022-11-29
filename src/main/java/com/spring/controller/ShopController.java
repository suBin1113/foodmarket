package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.Criteria;
import com.spring.domain.PageDTO;
import com.spring.domain.ShopVO;
import com.spring.domain.WishlistVO;
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
		log.info("cri:" + cri);
		int total = service.getTotal(cri);
		model.addAttribute("shop", service.getList(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@GetMapping("/detail")
	public void detailForm(@RequestParam("pid") Long pid, @RequestParam("pageKind") String pageKind, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("detail form");
		model.addAttribute("product", service.get(pid));
		//log.info(pageKind);
		model.addAttribute("pageKind", pageKind);
	}
	
	@GetMapping("/shop_vegetable")
	public void vegetable(Criteria cri, Model model) {
		log.info("vegetable form");
		int total = service.getTotalVege(cri);
		model.addAttribute("shop_vege", service.getListVege(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}

	@GetMapping("/shop_fruit")
	public void fruit(Criteria cri, Model model) {
		log.info("fruit form");
		int total = service.getTotalFru(cri);
		model.addAttribute("shop_fru", service.getListFru(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@GetMapping("/shop_juice")
	public void juice(Criteria cri, Model model) {
		log.info("juice form");
		int total = service.getTotalJui(cri);
		model.addAttribute("shop_jui", service.getListJui(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@GetMapping("/shop_dried")
	public void dried(Criteria cri, Model model) {
		log.info("dried form");
		int total = service.getTotalDri(cri);
		model.addAttribute("shop_dri", service.getListDri(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	@PostMapping("/addCart")
	public String addCart(ShopVO shop, RedirectAttributes rttr) {
		service.insert(shop);
		rttr.addFlashAttribute("insertCart", shop);
		return "redirect:/foodMarket/cart";
	}
	
	@PostMapping("/addWishList")
	public String addWishList(WishlistVO wish, RedirectAttributes rttr) {
		service.insertWish(wish);
		rttr.addFlashAttribute("insertWish", wish);
		return "redirect:/foodMarket/wishlist";
	}
}
