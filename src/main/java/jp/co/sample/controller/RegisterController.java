package jp.co.sample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.RegisterForm;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private ServletContext application;
	
	@RequestMapping("/")
	public String index() {
		
		return "tax/buygoods";
	
	}
	
	@RequestMapping("/price")
	
	public String Price(RegisterForm form) {
		Integer goods1=form.getGoods1();
		Integer goods2=form.getGoods2();
		Integer goods3=form.getGoods3();
		
		
	    Integer totalPrice=goods1+goods2+goods3;
	    Integer taxTotalPrice=(int)(totalPrice*1.08);
	    
	    application.setAttribute("totalPrice", totalPrice);
	    application.setAttribute("taxTotalPrice", taxTotalPrice);
	   
	   return "tax/totalprice";
	}
}
