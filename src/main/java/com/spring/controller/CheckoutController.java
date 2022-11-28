package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.CheckoutVO;
import com.spring.domain.OrderItemVO;
import com.spring.service.CheckoutService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CheckoutController {
	@Autowired
	private CheckoutService service;
	@Autowired
	private JavaMailSender mailsender;

	@GetMapping("foodMarket/checkout")
	public void register() {

	}

	@PostMapping("foodMarket/checkout")
	public String register(CheckoutVO checkout, RedirectAttributes rttr) {
		log.info("register: " + checkout);
		int psum = 0;
		service.register(checkout);
		for (int i = 0; i < service.getCartList().size(); i++) {
			OrderItemVO orderItem = new OrderItemVO();
			int totalPrice = (service.getCartList().get(i).getPprice() * service.getCartList().get(i).getPcount());
			orderItem.setOrderId(service.getOrderId());
			orderItem.setPid(service.getCartList().get(i).getPid());
			orderItem.setPname(service.getCartList().get(i).getPname());
			orderItem.setPcount(service.getCartList().get(i).getPcount());
			orderItem.setPprice(service.getCartList().get(i).getPprice());
			orderItem.setPimg(service.getCartList().get(i).getPimg());
			orderItem.setTotalPrice(totalPrice);
			//삽입하는거 수정
			
			psum += totalPrice;

			service.registerItem(orderItem);
		}
		
		checkout.setPsum(psum);
		service.updatePsum(checkout);
		rttr.addFlashAttribute("result", checkout.getOrderId());
		service.cartDelete(); //추가
		return "redirect:./orderDetails?orderId=" + checkout.getOrderId();
	}

	@PostMapping("foodMarket/checkout/remove")
	public String Remove(Long orderId, RedirectAttributes rttr) {
		if (service.remove(orderId) == 1 && service.removeItem(orderId) > 0) {
			rttr.addFlashAttribute("result", "success");
		}

		return "redirect:../orderDetails";
	}

	@GetMapping("foodMarket/orderDetails")
	public void get(@RequestParam(required = false) Long orderId, Model model) {
		model.addAttribute("checkout", service.get(orderId));
		model.addAttribute("orderList", service.getOrderList(orderId));
	}

}
