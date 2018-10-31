package jp.co.sample.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.RegisterForm;

/**
 * フォームで入力した商品の値段を表示するコントローラ.
 * @author momo.senda
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private ServletContext application;
	
	/**
	 * 入力画面を表示する
	 * @return 入力画面
	 */
	@RequestMapping("/")
	public String index() {
		
		return "tax/buygoods";
	
	}
	
	
	
	/**
	 * 商品の合計金額を計算して、税抜き・税込み価格を出力画面に表示する.
	 * @param form　フォーム
	 * @return　出力画面
	 */
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
