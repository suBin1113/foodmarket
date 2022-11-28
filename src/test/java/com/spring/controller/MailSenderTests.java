package com.spring.controller;

import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MailSenderTests {
	@Autowired
	JavaMailSenderImpl mailSender;

	@Test
	public void mailSendTest() throws Exception {

		String subject = "test 메일";
		String content = "";
		String from = "pudeumakes@gmail.com";
		String to = "maing219@naver.com";
		
		content += "<body>\r\n" + 
				"    <table style=\"margin: 0 auto; width: 500px; text-align: center;\">\r\n" + 
				"        <tr>\r\n" + 
				"            <th>Product Name</th>\r\n" + 
				"            <th>Price</th>\r\n" + 
				"            <th>Quantity</th>\r\n" + 
				"            <th>Total</th>\r\n" + 
				"        </tr>\r\n" + 
				"        <tr>\r\n" + 
				"            <th>item1</th>\r\n" + 
				"            <td>1000</td>\r\n" + 
				"            <td>2</td>\r\n" + 
				"            <td>2000</td>\r\n" + 
				"        </tr>\r\n" + 
				"        <tr>\r\n" + 
				"            <th>item2</th>\r\n" + 
				"            <td>1000</td>\r\n" + 
				"            <td>2</td>\r\n" + 
				"            <td>2000</td>\r\n" + 
				"        </tr>\r\n" + 
				"        <tr>\r\n" + 
				"            <th>item3</th>\r\n" + 
				"            <td>1000</td>\r\n" + 
				"            <td>2</td>\r\n" + 
				"            <td>2000</td>\r\n" + 
				"        </tr>\r\n" + 
				"        <tr>\r\n" + 
				"            <td colspan=\"4\">물품 총 구매 가격 : 6000</td>\r\n" + 
				"        </tr>\r\n" + 
				"    </table>\r\n" + 
				"</body>";

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

	}
}
