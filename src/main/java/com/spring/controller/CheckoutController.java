package com.spring.controller;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
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
	JavaMailSenderImpl mailSender;

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
		
		//메일 전송 부분
		String subject = "test 메일";
		String content = "";
		String from = "pudeumakes@gmail.com";
		String to = "maing219@naver.com";
		
		content += "<table style=\"width: 500px; text-align: center;\">"; 
		content += "<tr>";
		content += "<th style=\"padding: 10px 0;\">Product Name</th>";
		content += "<th>Price</th>";
		content += "<th>Quantity</th>";
		content += "<th>Total</th>";
		content += "</tr>";
		
		for (int i=0; i<service.getCartList().size(); i++) {
			content += "<tr>";
			content += "<th style=\"padding: 10px 0;\">" + service.getCartList().get(i).getPname() + "</th>";
			content += "<td>" + service.getCartList().get(i).getPprice() + "</td>";
			content += "<td>" + service.getCartList().get(i).getPcount() + "</td>";
			content += "<td>" + (service.getCartList().get(i).getPprice() * + service.getCartList().get(i).getPcount()) + "</td>";
			content += "</tr>";
		}

		content += "<tr>"; 
		content += "<td colspan=\"4\" style=\"padding: 10px 0;\">물품 총 구매 가격 : " + psum + "</td>"; 
		content += "</tr>";
		content += "</table>"; 
		content += "<div style=\"width: 500px; text-align: center;\">"; 
		content += "<p style=\"margin: 10px 0\"><b>Order Details</b></p>"; 
		content += "<table style=\"width: 500px; text-align: center;\">";
		content += "<tr>";
		content += "<th>주문번호</th>"; 
		content += "<td>" + checkout.getOrderId() + "</td>";
		content += "</tr>";
		content += "<tr>"; 
		content += "<th>이름</th>";
		content += "<td>" + checkout.getName() + "</td>";
		content += "</tr>";
		content += "<tr>";
		content += "<th>주소</th>"; 
		content += "<td>" + checkout.getAddress() + "</td>"; 
		content += "</tr>";
		content += "<tr>";
		content += "<th>우편번호</th>"; 
		content += "<td>" + checkout.getZip() + "</td>";
		content += "</tr>";
		content += "<tr>";
		content += "<th>주문일</th>";
		content += "<td>" + checkout.getAddress() + "</td>";
		content += "</tr>";
		content += "</table>";
		content += "</div>";

		try {
			MimeMessage mail = mailSender.createMimeMessage();
			MimeMessageHelper mailHelper = new MimeMessageHelper(mail, "UTF-8");

			mailHelper.setFrom(from);
			mailHelper.setTo(to);
			mailHelper.setSubject(subject);
			mailHelper.setText(content, true);

			mailSender.send(mail);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		checkout.setPsum(psum);
		service.updatePsum(checkout);
		service.cartDelete(); //추가
		rttr.addFlashAttribute("result", checkout.getOrderId());
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
