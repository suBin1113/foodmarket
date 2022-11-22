package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.CheckoutVO;
import com.spring.service.CheckoutService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CheckoutController {
	@Autowired
	private CheckoutService service;
	
	@GetMapping("foodMarket/checkout")
	public void register() {
		
	}
	
	@PostMapping("foodMarket/checkout")
	public String register(CheckoutVO checkout, RedirectAttributes rttr) {
		log.info("register: " + checkout);
		service.register(checkout);
		rttr.addFlashAttribute("result", checkout.getOrderId());
		return "redirect:./orderDetails?orderId=" + checkout.getOrderId();
	}
	
	@PostMapping("foodMarket/checkout/remove")
	public String Remove(Long orderId, RedirectAttributes rttr) {
		if (service.remove(orderId) == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:../orderDetails";
	}

	@GetMapping("foodMarket/orderDetails")
	public void get(@RequestParam(required = false) Long orderId, Model model) {
		model.addAttribute("checkout", service.get(orderId));
		model.addAttribute("orderList", service.getOrderList(orderId));
	}
	
	//@PostMapping("foodMarket/orderDetails")
	//public void get() {
		
	//}
	
}
